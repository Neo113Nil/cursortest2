package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.dto.common.id.UserId;
import xsna.k840;

/* compiled from: MusicAndroidAutoOfflineCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class z940 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final bpn0 E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z940(Bundle bundle) {
        super(r0, r1);
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("owner_id");
            parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
        }
        UserId userId = (UserId) parcelable;
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        this.D = string2;
        this.E = new bpn0(new v100(this, 2));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        k840.a.d().g();
        e22 e22Var = (e22) this.E.getValue();
        bqz0 bqz0Var = e22Var.a;
        String str2 = e22Var.b;
        boolean z = false;
        if (str2 != null && drm0.D(str2, MusicCollectionType.AUDIOS.m(), false)) {
            z = true;
        }
        return bqz0Var.p(z).l(new d22(new on(e22Var, 2), 0)).w();
    }
}
