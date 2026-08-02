package xsna;

import com.vk.dto.newsfeed.entries.DigestItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DigestNormalizer.kt */
/* loaded from: classes4.dex */
public final class oym {
    public final ArrayList<DigestItem> a = new ArrayList<>();

    public oym(Iterator<DigestItem> it) {
        for (int i = 0; i < 3; i++) {
            if (it.hasNext()) {
                this.a.add(it.next());
            }
        }
    }

    public final boolean a() {
        ArrayList<DigestItem> arrayList = this.a;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (((DigestItem) it.next()).h) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        int i;
        ArrayList<DigestItem> arrayList = this.a;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((DigestItem) it.next()).h && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        return i <= 1;
    }
}
