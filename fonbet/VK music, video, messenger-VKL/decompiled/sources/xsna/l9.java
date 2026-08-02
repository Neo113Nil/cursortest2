package xsna;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import com.ironsource.X3;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.products_multipicker.impl.di.ProductsMultipickerComponentImpl;
import com.vk.fave.di.FaveComponentImpl;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.MediaPipelineComponentVkApp;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import xsna.bbv0;
import xsna.cs;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StoreExceptionHandler initialize$lambda$220$lambda$173;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return cs.a.a((13 & 4) != 0 ? null : "nom", null, e43.l("photo_base", X3.j.D));
            case 2:
                return new io.reactivex.rxjava3.disposables.b();
            case 3:
                qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
                return null;
            case 4:
                return Pattern.compile("[а-яА-Яa-zA-Z0-9 \\-_]{2,50}");
            case 5:
                return "loaderEventsError: ";
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsInterestsComponentImpl.o;
                return new eie();
            case 8:
                qcy<Object>[] qcyVarArr3 = CommonEditorComponentImpl.h;
                return new lz8();
            case 9:
                qcy<Object>[] qcyVarArr4 = FaveComponentImpl.e;
                return new jsq();
            case 10:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 11:
                return new SpannableStringBuilder();
            case 12:
                return new gko(R.drawable.vk_icon_search_outline_28);
            case 13:
                return new m5w((d5w) d5w.j.getValue(), EmptyList.b);
            case 14:
                return s3q0.a;
            case 15:
                return ckw.a;
            case 16:
                return Pattern.compile("\\[((?:id|public|app|club|event)[0-9]+|(?:page|video|topic)-[0-9]+_[0-9]+)(?:\\|([^]\\[]+)?]|])");
            case 17:
                return s3q0.a;
            case 18:
                qcy<Object>[] qcyVarArr5 = MediaPipelineComponentVkApp.d;
                return new yu10(qsk0.a);
            case 19:
                return s3q0.a;
            case 20:
                return k840.a.d();
            case 21:
                return k840.a.i;
            case 22:
                return new ots();
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr6 = ProductsMultipickerComponentImpl.b;
                return new btd0();
            case 26:
                return new p6i();
            case 27:
                initialize$lambda$220$lambda$173 = ServiceProvider.initialize$lambda$220$lambda$173();
                return initialize$lambda$220$lambda$173;
            case 28:
                return new n6j0(x5j0.a, x5j0.b, x5j0.c, x5j0.d, x5j0.f, x5j0.e, x5j0.g, x5j0.h);
            default:
                qcy<Object>[] qcyVarArr7 = SharingImEngineComponentImpl.m;
                return new gdm();
        }
    }
}
