package ru.ok.tensorflow.execution;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class BatchedExecutor<T, R> {
    protected List<SingleExecutor<T, R>> executors = Collections.EMPTY_LIST;

    public List<Pair<Boolean, R>> execute(T t) {
        ArrayList arrayList = new ArrayList(this.executors.size());
        for (int size = this.executors.size() - 1; size >= 0; size--) {
            Pair<Boolean, R> execute = this.executors.get(size).execute(t);
            Boolean bool = (Boolean) execute.first;
            boolean booleanValue = bool.booleanValue();
            Object obj = execute.second;
            if (!booleanValue) {
                this.executors.remove(size);
            }
            arrayList.add(new Pair(bool, obj));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public List<R> executeFilter(T t) {
        ArrayList arrayList = new ArrayList(this.executors.size());
        for (int size = this.executors.size() - 1; size >= 0; size--) {
            Pair<Boolean, R> execute = this.executors.get(size).execute(t);
            boolean booleanValue = ((Boolean) execute.first).booleanValue();
            Object obj = execute.second;
            if (booleanValue) {
                arrayList.add(obj);
            } else {
                this.executors.remove(size);
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public void intialize(List<SingleExecutor<T, R>> list) {
        this.executors = list;
    }
}
