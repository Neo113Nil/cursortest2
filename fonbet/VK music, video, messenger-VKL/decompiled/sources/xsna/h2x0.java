package xsna;

import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.a;

/* compiled from: VoipSimpleAudioPlayer.kt */
/* loaded from: classes7.dex */
public final class h2x0 implements a.InterfaceC0045a {
    public final /* synthetic */ RawResourceDataSource a;

    public h2x0(RawResourceDataSource rawResourceDataSource) {
        this.a = rawResourceDataSource;
    }

    @Override // androidx.media3.datasource.a.InterfaceC0045a
    public final androidx.media3.datasource.a createDataSource() {
        return this.a;
    }
}
