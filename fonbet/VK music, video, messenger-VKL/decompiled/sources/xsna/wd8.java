package xsna;

import android.content.ComponentName;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesIsMessagesFromGroupAllowedResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.log.L;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.h;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.bbv0;
import xsna.c9t0;
import xsna.je10;
import xsna.p53;
import xsna.qtk0;
import xsna.xn50;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class wd8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v23, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        Integer num = null;
        Object obj2 = null;
        num = null;
        switch (this.b) {
            case 0:
                ((ke8) this.receiver).i.setText(zk70.b((Throwable) obj));
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                com.vk.channels.impl.list.a aVar = (com.vk.channels.impl.list.a) this.receiver;
                aVar.getClass();
                xn50.a.c(aVar, (com.vk.channels.impl.list.e) obj);
                return s3q0.a;
            case 3:
                com.vk.clips.favorites.impl.ui.folders.renaming.b bVar = (com.vk.clips.favorites.impl.ui.folders.renaming.b) this.receiver;
                bVar.getClass();
                xn50.a.c(bVar, (com.vk.clips.favorites.impl.ui.folders.renaming.a) obj);
                return s3q0.a;
            case 4:
                ((f4z) this.receiver).b((ypf) obj);
                return s3q0.a;
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                int i2 = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.getClass();
                ClipFeedTab clipFeedTab = ((luf) obj).b;
                if (!epx.f(clipsWrapperFragment.H0, clipFeedTab)) {
                    clipsWrapperFragment.H0 = clipFeedTab;
                    clipsWrapperFragment.go(new arf(clipsWrapperFragment, i));
                }
                return s3q0.a;
            case 6:
                com.vk.catalog2.common.ui.mvp.holder.group.topbar.a aVar2 = (com.vk.catalog2.common.ui.mvp.holder.group.topbar.a) obj;
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.receiver;
                communitiesCatalogRootVh.getClass();
                if (aVar2 instanceof a.f) {
                    CommunitiesCatalogRootVh.n0(communitiesCatalogRootVh, ((a.f) aVar2).a, true, SearchInputMethod.Keyboard, null, 18);
                } else if (aVar2 instanceof a.g) {
                    CommunitiesCatalogRootVh.n0(communitiesCatalogRootVh, ((a.g) aVar2).a, false, SearchInputMethod.Keyboard, null, 18);
                } else if (aVar2 instanceof a.h) {
                    vtk0.d().d(communitiesCatalogRootVh.R(), new eog(communitiesCatalogRootVh));
                } else if (aVar2 instanceof a.c) {
                    communitiesCatalogRootVh.k0();
                } else if (aVar2 instanceof a.e) {
                    communitiesCatalogRootVh.I.invoke();
                } else if (aVar2 instanceof a.C0502a) {
                    communitiesCatalogRootVh.t.invoke();
                } else if (aVar2 instanceof a.b) {
                    xng xngVar = communitiesCatalogRootVh.u;
                    if (xngVar != null) {
                        xngVar.invoke();
                    }
                } else {
                    if (!(aVar2 instanceof a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((o0r0) communitiesCatalogRootVh.a0.getValue()).p(communitiesCatalogRootVh.b);
                }
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                MessagesIsMessagesFromGroupAllowedResponseDto messagesIsMessagesFromGroupAllowedResponseDto = (MessagesIsMessagesFromGroupAllowedResponseDto) obj;
                ((fg20) this.receiver).getClass();
                boolean z = messagesIsMessagesFromGroupAllowedResponseDto.f() == BaseBoolIntDto.YES;
                List<String> d = messagesIsMessagesFromGroupAllowedResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                return new ngx0(p53.a.c(d, messagesIsMessagesFromGroupAllowedResponseDto.e()), z);
            case 9:
                return dhr0.t.a(((Number) obj).intValue());
            case 10:
                ((he10) this.receiver).T(je10.b.b);
                return s3q0.a;
            case 11:
                String str = (String) obj;
                e650 e650Var = (e650) this.receiver;
                List<? extends hfz> list = e650Var.h;
                if (!(list instanceof List)) {
                    list = null;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof pck0) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (!epx.f(((pck0) it.next()).b.a, str)) {
                            i++;
                        }
                    }
                    int i3 = i + 1;
                    Integer valueOf = Integer.valueOf(i3);
                    if (1 <= i3 && i3 < e650Var.h.size()) {
                        num = valueOf;
                    }
                    if (num != null) {
                        e650Var.i.invoke(Integer.valueOf(num.intValue()));
                    }
                }
                return s3q0.a;
            case 12:
                ((nma0) this.receiver).e.xn(R.string.vk_common_network_error);
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                return s3q0.a;
            case 13:
                L.i((Throwable) obj);
                return s3q0.a;
            case 14:
                c9t0 c9t0Var = (c9t0) obj;
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) this.receiver;
                cVar.getClass();
                if (!(c9t0Var instanceof c9t0.e)) {
                    return null;
                }
                qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var).e;
                if (!(qtk0Var instanceof qtk0.a)) {
                    return null;
                }
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                if (!((b25) bpn0Var.getValue()).b()) {
                    cVar.A.b(h.d.a);
                    return null;
                }
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    return (u490) ((qtk0.a) qtk0Var).a;
                }
                cVar.T(f.h.c.b);
                return null;
            case 15:
                SessionRoomId sessionRoomId = (SessionRoomId) obj;
                r6x0 r6x0Var = (r6x0) this.receiver;
                if (!epx.f(r6x0Var.k, sessionRoomId)) {
                    r6x0Var.k = sessionRoomId;
                    r6x0Var.s(null);
                    r6x0Var.n = null;
                    r6x0Var.g = null;
                    Iterator it2 = r6x0Var.j.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (epx.f(((MovieStartedData) next).getRoomId(), r6x0Var.k)) {
                                obj2 = next;
                            }
                        }
                    }
                    MovieStartedData movieStartedData = (MovieStartedData) obj2;
                    if (movieStartedData != null) {
                        r6x0Var.q(movieStartedData);
                    }
                }
                return s3q0.a;
            default:
                String str2 = (String) obj;
                ovx0 ovx0Var = (ovx0) this.receiver;
                int i4 = ovx0.m;
                ComponentName findServiceByAction = PackageExtenstionsKt.findServiceByAction(ovx0Var.getContext(), str2, ComponentActions.WORK_EXECUTOR_ACTION);
                if (findServiceByAction == null) {
                    Logger.DefaultImpls.error$default(ovx0Var.getLogger(), zr.a("Unable to resolve service in ", str2, " by action com.vk.push.WORK_EXECUTOR"), null, 2, null);
                }
                return findServiceByAction;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd8(Object obj, int i) {
        super(1, obj, L.class, ru.ok.android.utils.Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, f4z.class, "notify", "notify(Ljava/lang/Object;)V", 0);
                break;
            case 5:
            case 6:
            case 8:
            case 10:
            case 12:
            default:
                break;
            case 7:
                super(1, obj, L.class, ru.ok.android.utils.Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, dhr0.class, "getDrawable", "getDrawable(I)Landroid/graphics/drawable/Drawable;", 0);
                break;
            case 11:
                super(1, obj, e650.class, "scrollToNextSection", "scrollToNextSection(Ljava/lang/String;)V", 0);
                break;
            case 13:
                super(1, obj, L.class, ru.ok.android.utils.Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 14:
                super(1, obj, com.vk.video.profile.presentation.c.class, "getOwnerData", "getOwnerData(Lcom/vk/video/profile/presentation/state/VideoProfileState;)Lcom/vk/video/profile/data/models/OwnerData;", 0);
                break;
        }
    }
}
