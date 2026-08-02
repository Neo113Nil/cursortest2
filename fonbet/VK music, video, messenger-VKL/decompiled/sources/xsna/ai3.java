package xsna;

import android.content.Context;
import androidx.preference.Preference;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.Pair;
import xsna.by1;
import xsna.bzp0;
import xsna.ei3;
import xsna.fit;
import xsna.ihz;
import xsna.ngl;
import xsna.xfh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ai3 implements io.reactivex.rxjava3.functions.c, ngl.a, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.j, io.reactivex.rxjava3.functions.m, wut0, Preference.c, ihz.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (ei3.a) ((zh3) this.c).invoke(obj, obj2);
            default:
                return (it80) ((zu3) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return ((xfh.a) this.c).w;
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        com.vk.auth.verification.base.c cVar2 = (com.vk.auth.verification.base.c) ((com.vk.auth.verification.base.b) this.c).a;
        if (cVar2 != null) {
            cVar2.E1(cVar.a, (r5 & 2) == 0, (r5 & 4) == 0);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.j
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (hda) ((gaa) this.c).invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        xgt0 xgt0Var = (xgt0) this.c;
        ((by1) obj).x(xgt0Var);
        int i = xgt0Var.a;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((z90) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ ai3(by1.a aVar, xgt0 xgt0Var) {
        this.b = 17;
        this.c = xgt0Var;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return (Cipher) ((z90) this.c).invoke(obj);
            case 4:
                return (List) ((oc0) this.c).invoke(obj);
            case 5:
            case 7:
            case 9:
            case 11:
            case 15:
            case 16:
            case 17:
            default:
                return (or00) ((tuq) this.c).invoke(obj);
            case 6:
                return (Pair) ((kf1) this.c).invoke(obj);
            case 8:
                return (ClipItemPatch) ((z90) this.c).invoke(obj);
            case 10:
                return (u2e) ((ym1) this.c).invoke(obj);
            case 12:
                return (ved) ((gl6) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((v74) this.c).invoke(obj);
            case 14:
                return (List) ((kf1) this.c).invoke(obj);
            case 18:
                return (s39) ((vfk) this.c).invoke(obj);
            case 19:
                return (utk) ((tuq) this.c).invoke(obj);
            case 20:
                return (kqs) ((tuq) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.e) ((v74) this.c).invoke(obj);
            case 22:
                return (List) ((wje) this.c).invoke(obj);
            case 23:
                return ((fit.q) this.c).invoke(obj);
            case 24:
                return (List) ((vfk) this.c).invoke(obj);
            case 25:
                return (ncq0) ((tuq) this.c).invoke(obj);
            case 26:
                return (List) ((zd10) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((com.vk.newsfeed.impl.util.a) this.c).invoke(obj);
            case 28:
                return (SuperAppAnimationConfig) ((vfk) this.c).invoke(obj);
        }
    }
}
