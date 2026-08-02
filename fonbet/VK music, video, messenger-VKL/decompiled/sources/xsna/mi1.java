package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorCellVh;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Parameters;
import com.vk.superapp.core.js.bridge.api.events.SetViewSettings$Response;
import com.vk.toggle.features.ImFeatures;
import java.lang.ref.WeakReference;
import kotlin.Result;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mi1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mi1(SearchAuthorCellVh searchAuthorCellVh, Context context, UIBlockSearchAuthor uIBlockSearchAuthor) {
        this.b = 5;
        this.c = searchAuthorCellVh;
        this.e = context;
        this.d = uIBlockSearchAuthor;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        Object failure;
        ViewTreeObserver viewTreeObserver;
        int i = this.b;
        int i2 = 3;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((izs) obj3).invoke(new yk1(((al1) obj2).b, (Context) obj));
                return s3q0.a;
            case 1:
                b2b b2bVar = ((x2b) obj3).i;
                io.reactivex.rxjava3.internal.operators.completable.u o = b2bVar.c.c((MsgFromChannel) obj2, (ChannelType) obj).o(asu0.a.d());
                com.vk.im.popup.a aVar = b2bVar.d;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                b2bVar.f.b(com.vk.im.popup.e.a(o, aVar, new ehd0(com.vk.toggle.b.A.a(imFeatures))).subscribe(new uy3(b2bVar, i2), new xf1(new com.vk.movika.sdk.base.observable.a(b2bVar, 19), 9)));
                return s3q0.a;
            case 2:
                com.vk.photos.ui.editalbum.domain.c cVar = (com.vk.photos.ui.editalbum.domain.c) obj3;
                cVar.T(e.f.b);
                cVar.W((PhotoAlbum) obj2, (com.vk.photos.ui.editalbum.domain.h) obj);
                return s3q0.a;
            case 3:
                ((izs) obj3).invoke(new o9t.m(m6t.a((l6t) obj2, ((k6t) obj).c)));
                return s3q0.a;
            case 4:
                p3y p3yVar = (p3y) obj3;
                SetViewSettings$Parameters setViewSettings$Parameters = (SetViewSettings$Parameters) obj2;
                String str = (String) obj;
                xwv0 xwv0Var = p3yVar.d;
                if (xwv0Var != null) {
                    String c = setViewSettings$Parameters.c();
                    if (c == null) {
                        c = "";
                    }
                    boolean z2 = setViewSettings$Parameters.e() != SetViewSettings$Parameters.StatusBarStyle.DARK;
                    String d = setViewSettings$Parameters.d();
                    z = xwv0Var.U(c, d != null ? d : "", z2);
                } else {
                    z = false;
                }
                if (z) {
                    y1n0 X0 = p3yVar.X0();
                    X0.getClass();
                    com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppSetViewSettings"), new SetViewSettings$Response(null, new SetViewSettings$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
                } else {
                    p3yVar.L0().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str, 1, null));
                }
                return s3q0.a;
            case 5:
                ((SearchAuthorCellVh) obj3).k.c((Context) obj, (UIBlockSearchAuthor) obj2, false);
                return s3q0.a;
            case 6:
                ParticipantVideoViewManager<TextureViewRenderer> participantVideoViewManager = ((sct0) obj3).b;
                participantVideoViewManager.setParticipantView(participantVideoViewManager.getOwnVideoTrack(), (TextureViewRenderer) obj2, (FrameDecorator) obj);
                return s3q0.a;
            default:
                WeakReference weakReference = (WeakReference) obj3;
                m8v0 m8v0Var = (m8v0) obj2;
                WindowManager windowManager = (WindowManager) obj;
                int i3 = m8v0.M;
                try {
                    View view = (View) weakReference.get();
                    if (view != null) {
                        view.removeOnLayoutChangeListener(m8v0Var.J);
                    }
                    View view2 = (View) weakReference.get();
                    if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(m8v0Var.L);
                    }
                    windowManager.removeView(m8v0Var);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
        }
    }

    public /* synthetic */ mi1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
