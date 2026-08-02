package defpackage;

import okhttp3.OkHttpClient;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes8.dex */
public final /* synthetic */ class gn2 implements xf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gn2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((OkHttpClient) ((i3y) obj).getValue()).newCall(d5j0Var);
            case 1:
                xf7 xf7Var = (xf7) ((i3y) obj).getValue();
                t4j0 b = d5j0Var.b();
                b.c.a(GlideBitmapDownloader.ACCEPT_HEADER, GlideBitmapDownloader.ACCEPT_WEBP);
                return xf7Var.newCall(new d5j0(b));
            default:
                return ((OkHttpClient) ((u0d0) obj).b.getValue()).newCall(d5j0Var);
        }
    }
}
