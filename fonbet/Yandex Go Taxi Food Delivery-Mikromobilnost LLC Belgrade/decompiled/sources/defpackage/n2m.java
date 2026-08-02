package defpackage;

import flex.core.loader.network.c;
import java.io.InputStream;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class n2m implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ n2m(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        c cVar = this.b;
        InputStream inputStream = (InputStream) obj;
        switch (i) {
        }
        return (kg90) cVar.a(b.f(), inputStream);
    }
}
