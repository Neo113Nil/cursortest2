package xsna;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import xsna.vlp0;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class dnp0 extends vlp0 {
    public ArrayList<vlp0> b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public vlp0[] g;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes12.dex */
    public class a extends ymp0 {
        public final /* synthetic */ vlp0 b;

        public a(vlp0 vlp0Var) {
            this.b = vlp0Var;
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            this.b.runAnimators();
            vlp0Var.removeListener(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes12.dex */
    public class b extends ymp0 {
        public b() {
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            dnp0 dnp0Var = dnp0.this;
            dnp0Var.b.remove(vlp0Var);
            if (dnp0Var.hasAnimators()) {
                return;
            }
            dnp0Var.notifyListeners(vlp0.j.D7, false);
            dnp0Var.mEnded = true;
            dnp0Var.notifyListeners(vlp0.j.C7, false);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes12.dex */
    public static class c extends ymp0 {
        public final dnp0 b;

        public c(dnp0 dnp0Var) {
            this.b = dnp0Var;
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            dnp0 dnp0Var = this.b;
            int i = dnp0Var.d - 1;
            dnp0Var.d = i;
            if (i == 0) {
                dnp0Var.e = false;
                dnp0Var.end();
            }
            vlp0Var.removeListener(this);
        }

        @Override // xsna.ymp0, xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
            dnp0 dnp0Var = this.b;
            if (dnp0Var.e) {
                return;
            }
            dnp0Var.start();
            dnp0Var.e = true;
        }
    }

    public dnp0() {
        this.b = new ArrayList<>();
        this.c = true;
        this.e = false;
        this.f = 0;
    }

    public final dnp0 a(vlp0.i iVar) {
        return (dnp0) super.addListener(iVar);
    }

    @Override // xsna.vlp0
    public final vlp0 addListener(vlp0.i iVar) {
        return (dnp0) super.addListener(iVar);
    }

    @Override // xsna.vlp0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dnp0 addTarget(View view) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget(view);
        }
        return (dnp0) super.addTarget(view);
    }

    public final void c(vlp0 vlp0Var) {
        this.b.add(vlp0Var);
        vlp0Var.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            vlp0Var.setDuration(j);
        }
        if ((this.f & 1) != 0) {
            vlp0Var.setInterpolator(getInterpolator());
        }
        if ((this.f & 2) != 0) {
            vlp0Var.setPropagation(getPropagation());
        }
        if ((this.f & 4) != 0) {
            vlp0Var.setPathMotion(getPathMotion());
        }
        if ((this.f & 8) != 0) {
            vlp0Var.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // xsna.vlp0
    public final void cancel() {
        super.cancel();
        vlp0[] i = i();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            i[i2].cancel();
        }
        Arrays.fill(i, (Object) null);
        this.g = i;
    }

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        if (isValidTarget(gnp0Var.b)) {
            Iterator<vlp0> it = this.b.iterator();
            while (it.hasNext()) {
                vlp0 next = it.next();
                if (next.isValidTarget(gnp0Var.b)) {
                    next.captureEndValues(gnp0Var);
                    gnp0Var.c.add(next);
                }
            }
        }
    }

    @Override // xsna.vlp0
    public final void capturePropagationValues(gnp0 gnp0Var) {
        super.capturePropagationValues(gnp0Var);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).capturePropagationValues(gnp0Var);
        }
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        if (isValidTarget(gnp0Var.b)) {
            Iterator<vlp0> it = this.b.iterator();
            while (it.hasNext()) {
                vlp0 next = it.next();
                if (next.isValidTarget(gnp0Var.b)) {
                    next.captureStartValues(gnp0Var);
                    gnp0Var.c.add(next);
                }
            }
        }
    }

    @Override // xsna.vlp0
    public final void createAnimators(ViewGroup viewGroup, hnp0 hnp0Var, hnp0 hnp0Var2, ArrayList<gnp0> arrayList, ArrayList<gnp0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            vlp0 vlp0Var = this.b.get(i);
            if (startDelay > 0 && (this.c || i == 0)) {
                long startDelay2 = vlp0Var.getStartDelay();
                if (startDelay2 > 0) {
                    vlp0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    vlp0Var.setStartDelay(startDelay);
                }
            }
            vlp0Var.createAnimators(viewGroup, hnp0Var, hnp0Var2, arrayList, arrayList2);
        }
    }

    public final vlp0 d(int i) {
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public final void e(long j) {
        ArrayList<vlp0> arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.b) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setDuration(j);
        }
    }

    @Override // xsna.vlp0
    public final vlp0 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // xsna.vlp0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dnp0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f |= 1;
        ArrayList<vlp0> arrayList = this.b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (dnp0) super.setInterpolator(timeInterpolator);
    }

    @Override // xsna.vlp0
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        vlp0[] i = i();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            i[i2].forceToEnd(viewGroup);
        }
        Arrays.fill(i, (Object) null);
        this.g = i;
    }

    public final void g(int i) {
        if (i == 0) {
            this.c = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(lhg.a(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.c = false;
        }
    }

    @Override // xsna.vlp0
    public final boolean hasAnimators() {
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    public final vlp0[] i() {
        vlp0[] vlp0VarArr = this.g;
        this.g = null;
        if (vlp0VarArr == null) {
            vlp0VarArr = new vlp0[this.b.size()];
        }
        return (vlp0[]) this.b.toArray(vlp0VarArr);
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (!this.b.get(i).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vlp0
    public final void pause(View view) {
        super.pause(view);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).pause(view);
        }
    }

    @Override // xsna.vlp0
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        b bVar = new b();
        for (int i = 0; i < this.b.size(); i++) {
            vlp0 vlp0Var = this.b.get(i);
            vlp0Var.addListener(bVar);
            vlp0Var.prepareAnimatorsForSeeking();
            long totalDurationMillis = vlp0Var.getTotalDurationMillis();
            if (this.c) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                vlp0Var.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    @Override // xsna.vlp0
    public final vlp0 removeListener(vlp0.i iVar) {
        return (dnp0) super.removeListener(iVar);
    }

    @Override // xsna.vlp0
    public final vlp0 removeTarget(View view) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).removeTarget(view);
        }
        return (dnp0) super.removeTarget(view);
    }

    @Override // xsna.vlp0
    public final void resume(View view) {
        super.resume(view);
        vlp0[] i = i();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            i[i2].resume(view);
        }
        Arrays.fill(i, (Object) null);
        this.g = i;
    }

    @Override // xsna.vlp0
    public final void runAnimators() {
        if (this.b.isEmpty()) {
            start();
            end();
            return;
        }
        c cVar = new c(this);
        Iterator<vlp0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().addListener(cVar);
        }
        this.d = this.b.size();
        if (this.c) {
            Iterator<vlp0> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().runAnimators();
            }
            return;
        }
        for (int i = 1; i < this.b.size(); i++) {
            this.b.get(i - 1).addListener(new a(this.b.get(i)));
        }
        vlp0 vlp0Var = this.b.get(0);
        if (vlp0Var != null) {
            vlp0Var.runAnimators();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // xsna.vlp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCurrentPlayTimeMillis(long j, long j2) {
        long j3;
        long totalDurationMillis = getTotalDurationMillis();
        long j4 = 0;
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(vlp0.j.B7, z);
        }
        if (!this.c) {
            int i = 1;
            while (true) {
                if (i >= this.b.size()) {
                    i = this.b.size();
                    break;
                } else if (this.b.get(i).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = i - 1;
            if (j >= j2) {
                while (i2 < this.b.size()) {
                    vlp0 vlp0Var = this.b.get(i2);
                    long j5 = vlp0Var.mSeekOffsetInParent;
                    j3 = j4;
                    long j6 = j - j5;
                    if (j6 < j3) {
                        break;
                    }
                    vlp0Var.setCurrentPlayTimeMillis(j6, j2 - j5);
                    i2++;
                    j4 = j3;
                }
            } else {
                j3 = 0;
                while (i2 >= 0) {
                    vlp0 vlp0Var2 = this.b.get(i2);
                    long j7 = vlp0Var2.mSeekOffsetInParent;
                    long j8 = j - j7;
                    vlp0Var2.setCurrentPlayTimeMillis(j8, j2 - j7);
                    if (j8 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            if (this.mParent == null) {
                if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(vlp0.j.C7, z);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            this.b.get(i3).setCurrentPlayTimeMillis(j, j2);
        }
        j3 = j4;
        if (this.mParent == null) {
        }
    }

    @Override // xsna.vlp0
    public final /* bridge */ /* synthetic */ vlp0 setDuration(long j) {
        e(j);
        return this;
    }

    @Override // xsna.vlp0
    public final void setEpicenterCallback(vlp0.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f |= 8;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setEpicenterCallback(fVar);
        }
    }

    @Override // xsna.vlp0
    public final void setPathMotion(pq90 pq90Var) {
        super.setPathMotion(pq90Var);
        this.f |= 4;
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(i).setPathMotion(pq90Var);
            }
        }
    }

    @Override // xsna.vlp0
    public final void setPropagation(bnp0 bnp0Var) {
        super.setPropagation(bnp0Var);
        this.f |= 2;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).setPropagation(bnp0Var);
        }
    }

    @Override // xsna.vlp0
    public final vlp0 setStartDelay(long j) {
        return (dnp0) super.setStartDelay(j);
    }

    @Override // xsna.vlp0
    public final String toString(String str) {
        String vlp0Var = super.toString(str);
        for (int i = 0; i < this.b.size(); i++) {
            StringBuilder b2 = ho8.b(vlp0Var, "\n");
            b2.append(this.b.get(i).toString(str + "  "));
            vlp0Var = b2.toString();
        }
        return vlp0Var;
    }

    @Override // xsna.vlp0
    public final vlp0 addTarget(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).addTarget(i);
        }
        return (dnp0) super.addTarget(i);
    }

    @Override // xsna.vlp0
    public final vlp0 clone() {
        dnp0 dnp0Var = (dnp0) super.clone();
        dnp0Var.b = new ArrayList<>();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            vlp0 clone = this.b.get(i).clone();
            dnp0Var.b.add(clone);
            clone.mParent = dnp0Var;
        }
        return dnp0Var;
    }

    @Override // xsna.vlp0
    public final vlp0 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // xsna.vlp0
    public final vlp0 addTarget(String str) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget(str);
        }
        return (dnp0) super.addTarget(str);
    }

    public dnp0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList<>();
        this.c = true;
        this.e = false;
        this.f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jtm0.h);
        g(ytp0.f(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.vlp0
    public final vlp0 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // xsna.vlp0
    public final vlp0 addTarget(Class cls) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).addTarget((Class<?>) cls);
        }
        return (dnp0) super.addTarget((Class<?>) cls);
    }

    @Override // xsna.vlp0
    public final vlp0 excludeTarget(Class<?> cls, boolean z) {
        for (int i = 0; i < this.b.size(); i++) {
            this.b.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }
}
