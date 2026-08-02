package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import defpackage.ah2;
import defpackage.bh2;
import defpackage.ck2;
import defpackage.y4n;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class a {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public boolean e = false;

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((bh2) it.next()).a();
        }
        ArrayList arrayList2 = this.b;
        this.d = arrayList2.size();
        ArrayList arrayList3 = this.a;
        if (!arrayList3.isEmpty()) {
            this.d++;
        }
        if (this.d == 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((bh2) it2.next()).b();
            }
            this.e = false;
            return;
        }
        ah2 ah2Var = new ah2(this);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            y4n y4nVar = (y4n) it3.next();
            y4nVar.a(ah2Var);
            y4nVar.h();
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ck2.a(animatorSet, new ArrayList(arrayList3));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.animation.AnimationCoordinator$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a aVar = a.this;
                int i = aVar.d - 1;
                aVar.d = i;
                if (i == 0) {
                    Iterator it4 = aVar.c.iterator();
                    while (it4.hasNext()) {
                        ((bh2) it4.next()).b();
                    }
                    aVar.e = false;
                }
            }
        });
        animatorSet.start();
    }
}
