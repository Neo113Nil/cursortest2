package defpackage;

import com.yandex.messaging.core.net.entities.MediaMessageListData;

/* loaded from: classes15.dex */
public class m7b implements ho3 {
    public final tls a;
    public final tls b;

    public /* synthetic */ m7b(tls tlsVar, tls tlsVar2) {
        this.a = tlsVar;
        this.b = tlsVar2;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        this.a.invoke((MediaMessageListData) obj);
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        this.b.invoke(Integer.valueOf(i));
        return true;
    }
}
