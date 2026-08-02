package defpackage;

import com.ybsdk.feature.deeplink.api.Deeplink;

/* loaded from: classes3.dex */
public final /* synthetic */ class pv3 implements a3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3z b;

    public /* synthetic */ pv3(b3z b3zVar, int i) {
        this.a = i;
        this.b = b3zVar;
    }

    @Override // defpackage.a3z
    public final y0h a(Deeplink deeplink) {
        int i = this.a;
        b3z b3zVar = this.b;
        switch (i) {
        }
        return b3zVar.c(deeplink.getParsedUri().toString()).a;
    }
}
