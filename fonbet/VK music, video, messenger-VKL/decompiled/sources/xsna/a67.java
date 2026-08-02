package xsna;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.task.di.components.BridgeComponentImpl;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a67 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AppCompatActivity appCompatActivity = (AppCompatActivity) ((Activity) this.c);
                appCompatActivity.getIntent().putExtra("app_content_hidden", true);
                appCompatActivity.getWindow().setFlags(8192, 8192);
                return s3q0.a;
            case 1:
                return ((BridgeComponentImpl) this.c).a.s();
            case 2:
                return (BridgeComponent) ((g8m) this.c).a(fpf0.a(BridgeComponent.class));
            case 3:
                return ((BridgeComponent) ((k7m) m7m.f((q8r) this.c)).a(fpf0.a(BridgeComponent.class))).s();
            case 4:
                ((n3w) this.c).a.getClass();
                return ply.a();
            case 5:
                return new jul0(((StoriesComponent) ((gxw) this.c).c().a(fpf0.a(StoriesComponent.class))).b());
            case 6:
                androidx.room.e eVar = (androidx.room.e) this.c;
                return Boolean.valueOf(!eVar.a.o() || eVar.a.s());
            case 7:
                return ((CartComponent) ((LinksBridgeComponentImpl) this.c).b.getValue()).f8();
            default:
                nwy nwyVar = ((NewsFeedComponentImpl) this.c).d;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[1];
                return new tv0(((AdPixelStatsComponent) nwyVar.c()).Ed());
        }
    }
}
