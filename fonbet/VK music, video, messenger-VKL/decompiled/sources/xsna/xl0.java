package xsna;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.translate.impl.models.LanguageModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import xsna.ei3;
import xsna.fit;
import xsna.hfc;
import xsna.io9;
import xsna.o430;
import xsna.pb20;
import xsna.unp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xl0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, AbstractPaginatedView.e, io.reactivex.rxjava3.core.a0, io9.c, Preference.b, io.reactivex.rxjava3.functions.m, ptk0, szs, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) debugDevSettingsFragment.findPreference("__dbg_post_visualize_by_mrc");
        if (((Boolean) obj).booleanValue()) {
            checkBoxPreference.O(false);
        }
        DebugDevSettingsFragment.jo();
        return true;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        z2n z2nVar = ((DiscoverMediaTabFragment2) this.c).P;
        s3q0 s3q0Var = s3q0.a;
        z2nVar.b.r(s3q0Var, (d6n) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 2:
                return (ei3.a) ((yh3) this.c).invoke(obj, obj2);
            case 3:
                return (Result) ((yh3) this.c).invoke(obj, obj2);
            case 9:
                ((z77) this.c).invoke(obj, obj2);
                return Boolean.TRUE;
            default:
                return (b110) ((cx) this.c).invoke(obj, obj2);
        }
    }

    @Override // com.vk.lists.AbstractPaginatedView.e
    public void b(int i) {
        BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) this.c;
        int i2 = BaseAttachPickerFragment.y0;
        baseAttachPickerFragment.oo().d(i);
    }

    @Override // xsna.io9.c
    public void c(Bitmap bitmap, byte[] bArr) {
        xn9 xn9Var = (xn9) this.c;
        xn9Var.b.post(new ee9(xn9Var, bitmap, bArr));
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        pb20 pb20Var = (pb20) this.c;
        pb20.a aVar = pb20.k1;
        pb20Var.getClass();
        LanguageModel languageModel = (LanguageModel) bundle.getSerializable("original.language.key");
        LanguageModel languageModel2 = (LanguageModel) bundle.getSerializable("translated.language.key");
        qb20 Yn = pb20Var.Yn();
        unp0.c cVar = new unp0.c(languageModel, languageModel2);
        if (epx.f(Yn.j, cVar)) {
            return;
        }
        Yn.j = cVar;
        Yn.Z0().k(Yn.i, cVar);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        com.vk.core.service.a aVar = (com.vk.core.service.a) this.c;
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) e43.a.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (aVar.f().getName().equals(it.next().service.getClassName())) {
                yVar.onSuccess(Boolean.TRUE);
            }
        }
        yVar.onSuccess(Boolean.FALSE);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((rl2) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((wl0) this.c).invoke(obj);
            case 1:
                return (Map) ((rl2) this.c).invoke(obj);
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 16:
            case 17:
            case 18:
            case 26:
            case 27:
            default:
                return (io.reactivex.rxjava3.core.b0) ((yw5) this.c).invoke(obj);
            case 4:
                return (Float) ((wl0) this.c).invoke(obj);
            case 5:
                return (Boolean) ((rl2) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((u6) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((wl0) this.c).invoke(obj);
            case 12:
                return ((hfc.b) this.c).invoke(obj);
            case 13:
                return (xkh0) ((rl2) this.c).invoke(obj);
            case 14:
                return (Boolean) ((rl2) this.c).invoke(obj);
            case 15:
                return (gcw) ((wcj) this.c).invoke(obj);
            case 19:
                return (f9n) ((wcj) this.c).invoke(obj);
            case 20:
                return (vww) ((rl2) this.c).invoke(obj);
            case 21:
                vep0 vep0Var = (vep0) obj;
                ((mes) this.c).getClass();
                return vep0Var;
            case 22:
                return (x30) ((fit.k) this.c).invoke(obj);
            case 23:
                return (Boolean) ((rl2) this.c).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((u3u) this.c).invoke(obj);
            case 25:
                return (utk) ((rl2) this.c).invoke(obj);
            case 28:
                return (s3q0) ((o430.a) this.c).invoke(obj);
        }
    }
}
