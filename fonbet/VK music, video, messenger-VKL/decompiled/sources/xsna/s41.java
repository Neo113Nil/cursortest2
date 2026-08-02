package xsna;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.multiaccount.api.f;
import java.io.File;
import java.util.List;
import xsna.drz;
import xsna.qdd;
import xsna.wfu;
import xsna.y490;
import xsna.ygb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s41 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.h, Toolbar.h, Preference.c, io.reactivex.rxjava3.functions.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s41(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (List) ((t40) this.c).invoke(obj);
            case 1:
                return (wfu.a) ((zt2) this.c).invoke(obj);
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 25:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.b0) ((kyb0) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.e) ((u9) this.c).invoke(obj);
            case 4:
                return (AboutVideoItem.d.InterfaceC1215d) ((u9) this.c).invoke(obj);
            case 5:
                return (StickerStockItem) ((md) this.c).invoke(obj);
            case 6:
                return (gcw) ((u9) this.c).invoke(obj);
            case 11:
                return (VerificationMethodTypes) ((md) this.c).invoke(obj);
            case 12:
                return (qdd.c) ((md) this.c).invoke(obj);
            case 13:
                return (u2e) ((md) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((md) this.c).invoke(obj);
            case 16:
                io.reactivex.rxjava3.subjects.d<Boolean> dVar = ((xur) this.c).f;
                bo boVar = new bo(19);
                dVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, boVar).U(new jo3((Drawable) obj, 14));
            case 17:
                return (GifWithQueryData) ((qbl) this.c).invoke(obj);
            case 18:
                return (WebIdentityCardData) ((wg1) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((per) this.c).invoke(obj);
            case 20:
                return (drz.a) ((per) this.c).invoke(obj);
            case 21:
                return (vr00) ((jjx) this.c).invoke(obj);
            case 22:
                return (f.c) ((u9) this.c).invoke(obj);
            case 23:
                return (File) ((ci3) this.c).invoke(obj);
            case 24:
                return (List) ((jjx) this.c).invoke(obj);
            case 27:
                return (Boolean) ((per) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (wfu.a.b) ((y490.c) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ygb.a) ((mgb) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.b) {
            case 10:
                ((qrb) this.c).b.a(menuItem.getItemId());
                break;
            default:
                ((defpackage.e0) this.c).invoke();
                break;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((md) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((md) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((bnc0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (hda) ((CatalogGetAudioSearchRequestFactory.b) this.c).invoke(obj, obj2);
    }
}
