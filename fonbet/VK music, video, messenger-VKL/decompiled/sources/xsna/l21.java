package xsna;

import android.os.Parcelable;
import com.vk.ads.api.di.AdsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import xsna.ej90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l21 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l21(UserId userId, String str, String str2) {
        this.d = userId;
        this.c = str;
        this.e = str2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                UserId userId = (UserId) this.d;
                String str = this.c;
                String str2 = (String) this.e;
                synchronized (s21.class) {
                    ((AdsComponent) j6i.c(m7m.f(s21.c), AdsComponent.class)).Ve();
                }
                return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(new k0y(userId, str, str2)), new m1r(new bjk(userId, 15), 4)).h(new b0y(new pba(j03.a, 4), 0));
            default:
                Post post = (Post) this.d;
                eax0.x(post, this.c, (ej90.b) this.e);
                return post;
        }
    }

    public /* synthetic */ l21(Post post, String str, ej90.b bVar, eax0 eax0Var) {
        this.d = post;
        this.c = str;
        this.e = bVar;
    }
}
