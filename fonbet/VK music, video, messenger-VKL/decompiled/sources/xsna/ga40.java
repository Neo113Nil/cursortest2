package xsna;

import android.os.Bundle;
import androidx.media3.exoplayer.i;
import com.vk.catalog2.common.ui.mvp.clip.VideoCatalogSearchFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.photos.root.presentation.a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import xsna.n8z0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga40 implements io.reactivex.rxjava3.functions.l, i.b, pcs, b680, io.reactivex.rxjava3.functions.m, Supplier1, Optional.Action, n8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ga40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.c).lambda$onVerificationInitialStarted$30((VerificationListener) obj);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((c3v) obj2).invoke(obj);
            case 1:
                return (List) ((c3v) obj2).invoke(obj);
            case 2:
                return (NewsEntry) ((ugm) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((or50) obj2).invoke(obj);
            case 4:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            case 15:
            case 16:
            default:
                return (WebApiApplication) ((cu4) obj2).invoke(obj);
            case 5:
                return (p2o) ((or50) obj2).invoke(obj);
            case 6:
                return (Photo) ((c3v) obj2).invoke(obj);
            case 10:
                return (ad7) ((mz80) obj2).invoke(obj);
            case 11:
                return (List) ((or50) obj2).invoke(obj);
            case 13:
                return (Pair) ((exi0) obj2).invoke(obj);
            case 17:
                return (Integer) ((lir0) obj2).invoke(obj);
            case 18:
                return (Integer) ((lir0) obj2).invoke(obj);
            case 19:
                return (it80) ((ifw0) obj2).invoke(obj);
            case 20:
                int i2 = otw0.i1;
                return (Boolean) ((gqq0) obj2).invoke(obj);
        }
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        xrz0 xrz0Var = (xrz0) this.c;
        rez0 rez0Var = (rez0) njz0Var;
        if (rez0Var == null) {
            iaz0 iaz0Var = (iaz0) xlaVar.b;
            if (iaz0Var != null) {
                gu8.c(null, "InstreamAdEngine: play - loading services failed - " + iaz0Var);
            }
            xrz0Var.b.b(0, 10002, "section=" + xrz0Var.a() + " , error=" + iaz0Var);
            if (!xrz0Var.e && xrz0Var == xrz0Var.j.get()) {
                xrz0Var.c();
            }
        } else {
            pjz0 b = rez0Var.b(xrz0Var.c.c);
            if (b != null) {
                xrz0Var.c.e(b);
            }
            xrz0Var.b.d(10001, xrz0Var.a());
            if (!xrz0Var.e && xrz0Var == xrz0Var.j.get()) {
                if (xrz0Var.c.k()) {
                    xrz0Var.d();
                } else {
                    xrz0Var.i = Collections.unmodifiableList(xrz0Var.c.d);
                    xrz0Var.e();
                }
            }
        }
        if (xrz0Var.e) {
            xrz0Var.b(true);
        }
    }

    @Override // ru.ok.gl.util.Supplier1
    public Object get(Object obj) {
        ModelDataProvider m398tryConfigureTensorflow$lambda6$lambda4;
        m398tryConfigureTensorflow$lambda6$lambda4 = TensorflowConfigurator.m398tryConfigureTensorflow$lambda6$lambda4((TensorflowConfigurator) this.c, (TensorflowModel) obj);
        return m398tryConfigureTensorflow$lambda6$lambda4;
    }

    @Override // androidx.media3.exoplayer.i.b
    public void handleMessage(int i, Object obj) {
        ((Runnable) this.c).run();
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        CountDownLatch countDownLatch = (CountDownLatch) this.c;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{"Fetching Rustore registration token failed " + th + '!'});
        }
        countDownLatch.countDown();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 7:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) obj;
                int i2 = PhotosRootFragment.X;
                String string = bundle.getString("HINT_ID");
                if (epx.f(string, HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_PHOTOFLOW.getId())) {
                    xn50.a.c(photosRootFragment, new a.f(false));
                    xn50.a.c(photosRootFragment, new a.i());
                }
                if (epx.f(string, HintId.PROFILE_PHOTO_FLOW_ON_BOARDING_BANNER_AUTOPLAY.getId())) {
                    xn50.a.c(photosRootFragment, a.C1509a.b);
                    break;
                }
                break;
            default:
                int i3 = VideoCatalogSearchFragment.X;
                CatalogRootViewHolder catalogRootViewHolder = ((VideoCatalogSearchFragment) obj).P;
                VideoCatalogSearchRootVh videoCatalogSearchRootVh = catalogRootViewHolder instanceof VideoCatalogSearchRootVh ? (VideoCatalogSearchRootVh) catalogRootViewHolder : null;
                if (videoCatalogSearchRootVh != null) {
                    videoCatalogSearchRootVh.w.d();
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((vlc0) this.c).invoke(obj)).booleanValue();
    }
}
