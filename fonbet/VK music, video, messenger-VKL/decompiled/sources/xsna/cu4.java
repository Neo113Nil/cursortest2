package xsna;

import android.location.Location;
import com.vk.antispam.ChatSpamAction;
import com.vk.api.generated.apps.dto.AppsGetResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import com.vk.translate.impl.models.LanguageModel;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: AudioReactionsInteractorImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                b2b b2bVar = (b2b) this.receiver;
                b2bVar.getClass();
                b2bVar.e.f(zk70.b((Throwable) obj));
                return s3q0.a;
            case 2:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.receiver;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, (CommunityProfileAction) obj);
                return s3q0.a;
            case 3:
                List list = (List) obj;
                xam xamVar = (xam) this.receiver;
                if (!hg1.d(xamVar.q)) {
                    InfoBar infoBar = xamVar.t.i;
                    if (infoBar == null) {
                        edw edwVar = edw.a;
                        edw.d(R.string.vkim_msg_header_antispam_actions_failed, xamVar.i, false);
                    } else {
                        String str = infoBar.b;
                        String Y0 = xam.Y0(infoBar);
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        Peer b = Peer.a.b(xamVar.t.a.e);
                        ChatSettings Bb = xamVar.t.a.Bb();
                        Peer peer = Bb != null ? Bb.d : null;
                        boolean contains = list.contains(ChatSpamAction.ExitChatAndClearHistory.b);
                        boolean contains2 = list.contains(ChatSpamAction.Report.b);
                        if (Y0 == null) {
                            Y0 = "";
                        }
                        io.reactivex.rxjava3.internal.operators.single.c C = xamVar.j.C(xamVar, new nbm(b, peer, contains, contains2, str, Y0, go9.b("from_", str), xyb.D));
                        asu0 asu0Var = asu0.a;
                        int i = 1;
                        xamVar.q = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new w00(new he3(21, xamVar, list), 19)), new tra(xamVar, i)), new gmj(xamVar, i), new h57(8, xamVar, list));
                    }
                }
                return s3q0.a;
            case 4:
                Throwable th = (Throwable) obj;
                mem memVar = (mem) this.receiver;
                sem semVar = memVar.s;
                if (semVar != null) {
                    semVar.c().dismiss();
                }
                if (memVar.s != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 5:
                Location location = (Location) obj;
                hzz hzzVar = (hzz) this.receiver;
                hzzVar.getClass();
                LocationCommon.a.getClass();
                if (epx.f(location, LocationCommon.b)) {
                    return io.reactivex.rxjava3.core.x.i(new Error("Can't fetch the current location."));
                }
                Coordinate coordinate = new Coordinate(location.getLatitude(), location.getLongitude());
                h18 h18Var = hzzVar.b;
                f2i f2iVar = (f2i) h18Var.b;
                f2iVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(coordinate.b);
                sb.append(',');
                sb.append(coordinate.c);
                return rsg0.D0(yfb.x(((yd10) f2iVar.b).u(Collections.singletonList(sb.toString())))).l(new aa6(new ug8((xfg0) h18Var.c, 6), 25));
            case 6:
                Throwable th2 = (Throwable) obj;
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) this.receiver;
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.e0.dismiss();
                }
                com.vk.im.ui.components.msg_list.a.P0.a(th2);
                vm30 vm30Var2 = aVar.o;
                if (vm30Var2 != null) {
                    vm30Var2.H(th2);
                }
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                LanguageModel languageModel = (LanguageModel) obj;
                i9i0 i9i0Var = (i9i0) this.receiver;
                i9i0Var.i = languageModel;
                i9i0Var.e.setText(languageModel.g());
                i9i0Var.b.Z0(languageModel);
                return s3q0.a;
            case 9:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 10:
                ((sfv0) this.receiver).a((ufv0) obj);
                return s3q0.a;
            default:
                return ((q73) this.receiver).p((AppsGetResponseDto) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu4(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, b2b.class, "showErrorSnackbar", "showErrorSnackbar(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
                super(1, obj, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                break;
            case 3:
                super(1, obj, xam.class, "executeChatSpamActions", "executeChatSpamActions(Ljava/util/List;)V", 0);
                break;
            case 4:
                super(1, obj, mem.class, "onMsgMarkAsSpamError", "onMsgMarkAsSpamError(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
                super(1, obj, hzz.class, "reverseGeocodeLocation", "reverseGeocodeLocation(Landroid/location/Location;)Lio/reactivex/rxjava3/core/Single;", 0);
                break;
            case 6:
            default:
                break;
            case 7:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, i9i0.class, "onTranslationLanguageSelected", "onTranslationLanguageSelected(Lcom/vk/translate/impl/models/LanguageModel;)V", 0);
                break;
            case 9:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
