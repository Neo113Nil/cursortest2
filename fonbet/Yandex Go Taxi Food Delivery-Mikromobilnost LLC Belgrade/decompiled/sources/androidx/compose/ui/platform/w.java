package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import defpackage.bkt;
import defpackage.bud;
import defpackage.bvf0;
import defpackage.dmw0;
import defpackage.fse;
import defpackage.mb51;
import defpackage.ohh0;
import defpackage.q2t0;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class w {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final v a(AbstractComposeView abstractComposeView, i iVar, androidx.compose.runtime.internal.a aVar) {
        AndroidComposeView androidComposeView;
        v vVar;
        if (bkt.a.compareAndSet(false, true)) {
            final kotlinx.coroutines.channels.a a2 = sb2.a(1, null, null, 6);
            tje.N(bvf0.a((fse) f.E.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(a2, null), 3);
            tls tlsVar = new tls() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    boolean compareAndSet = bkt.b.compareAndSet(false, true);
                    zy11 zy11Var = zy11.a;
                    if (compareAndSet) {
                        a2.d(zy11Var);
                    }
                    return zy11Var;
                }
            };
            synchronized (q2t0.c) {
                q2t0.i = kotlin.collections.a.o0(q2t0.i, tlsVar);
            }
            q2t0.a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(iVar);
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), iVar);
                    abstractComposeView.addView(androidComposeView.getView(), a);
                }
                androidComposeView.setComposeViewContext(iVar);
                if (abstractComposeView.getComposeViewContext() != null) {
                    iVar.c();
                    androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                if (m.b && androidComposeView.getTag(ohh0.inspection_slot_table_set) == null) {
                    androidComposeView.setTag(ohh0.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                }
                Object tag = androidComposeView.getTag(ohh0.wrapped_composition_tag);
                vVar = tag instanceof v ? (v) tag : null;
                if (vVar == null) {
                    vVar = new v(androidComposeView, new bud(iVar.b, new dmw0(androidComposeView.getRoot())));
                    androidComposeView.setTag(ohh0.wrapped_composition_tag, vVar);
                }
                vVar.a(aVar);
                androidComposeView.setFrameEndScheduler$ui(new mb51(iVar.b));
                return vVar;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        androidComposeView.setComposeViewContext(iVar);
        if (abstractComposeView.getComposeViewContext() != null) {
        }
        if (m.b) {
            androidComposeView.setTag(ohh0.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag2 = androidComposeView.getTag(ohh0.wrapped_composition_tag);
        if (tag2 instanceof v) {
        }
        if (vVar == null) {
        }
        vVar.a(aVar);
        androidComposeView.setFrameEndScheduler$ui(new mb51(iVar.b));
        return vVar;
    }
}
