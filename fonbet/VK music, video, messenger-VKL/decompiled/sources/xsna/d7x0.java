package xsna;

import android.media.VolumeProvider;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes12.dex */
public final class d7x0 extends VolumeProvider {
    public final /* synthetic */ f7x0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7x0(f7x0 f7x0Var, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = f7x0Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        k1u k1uVar = (k1u) this.a;
        h1u.this.a.post(new j1u(k1uVar, i));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        k1u k1uVar = (k1u) this.a;
        h1u.this.a.post(new i1u(k1uVar, i, 0));
    }
}
