package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.preference.Preference;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.dto.common.data.VKList;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.gij;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n5j0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, Preference.b, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n5j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        UnreadCounterSettingsFragment unreadCounterSettingsFragment = (UnreadCounterSettingsFragment) this.c;
        int i = UnreadCounterSettingsFragment.n0;
        boolean z = obj instanceof Boolean;
        Boolean bool = z ? (Boolean) obj : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            io.reactivex.rxjava3.disposables.b bVar = unreadCounterSettingsFragment.m0;
            gs gsVar = new gs();
            gsVar.K("name", "messages_counter_settings_include_channels");
            gsVar.R("value", booleanValue);
            gsVar.n = true;
            bVar.b(hg1.m(rsg0.y0(gsVar, null, null, 3), unreadCounterSettingsFragment.kn(), 0L, false, 62).subscribe(new o3y(new b9d(unreadCounterSettingsFragment, booleanValue, 2), 25), kwg0.b()));
        }
        return z;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 1:
                return (apl0) ((hd4) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((wni) this.c).invoke(obj, obj2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (s3q0) ((zqz) this.c).invoke(obj, obj2, obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.mbs0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final View view = (View) this.c;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = iah0.s(view.getContext());
        final ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.mbs0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean s = iah0.s(view.getContext());
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                if (ref$BooleanRef2.element != s) {
                    ref$BooleanRef2.element = s;
                    rVar.onNext(Boolean.valueOf(s));
                }
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(r2);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.nbs0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(r2);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 11:
                return ((Boolean) ((y160) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ygm0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (ffe0) ((c2k) obj2).invoke(obj);
            case 2:
                return (Boolean) ((jvl0) obj2).invoke(obj);
            case 4:
                return (gij.a) ((y160) obj2).invoke(obj);
            case 6:
                return (VKList) ((y160) obj2).invoke(obj);
            case 9:
                return (Integer) ((y160) obj2).invoke(obj);
            default:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                return (String) ((VkTopBarSearchQueryVh.c) obj2).invoke(obj);
        }
    }
}
