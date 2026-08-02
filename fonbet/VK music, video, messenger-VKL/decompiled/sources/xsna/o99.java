package xsna;

import android.content.Intent;
import android.graphics.Paint;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.photo.editor.markup.path.calculator.ArrowPathCalculator;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a9m0;
import xsna.ath0;
import xsna.ccu;
import xsna.go0;
import xsna.w9m0;
import xsna.xn50;
import xsna.y8g;
import xsna.y9m0;

/* compiled from: CallSettingsFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class o99 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o99(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        w9m0.a aVar = null;
        switch (this.b) {
            case 0:
                m99 m99Var = (m99) this.receiver;
                m99Var.f(s99.a(m99Var.j(), null, null, null, null, new go0.a((Throwable) obj), null, null, false, 239));
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                d8e d8eVar = (d8e) this.receiver;
                d8eVar.getClass();
                xn50.a.c(d8eVar, (qvq) obj);
                return s3q0.a;
            case 3:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 4:
                f1i f1iVar = (f1i) this.receiver;
                ((ath0.a) f1iVar.l1.c).j.e("search_params_view_location");
                zak0 zak0Var = (zak0) f1iVar.j1;
                VkGroupsSearchParams copy = ((VkGroupsSearchParams) zak0Var.getValue()).copy();
                copy.f = (SearchLocation) obj;
                copy.b = null;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 5:
                rho rhoVar = (rho) obj;
                DrawingView drawingView = ((ccu) this.receiver).a;
                z5g z5gVar = rhoVar.b;
                float f = rhoVar.a;
                int i = ccu.a.$EnumSwitchMapping$0[rhoVar.c.ordinal()];
                if (i == 1) {
                    float a = ccu.a(f);
                    y8g.c cVar = new y8g.c(z5gVar.a);
                    Paint.Style style = Paint.Style.STROKE;
                    jq90 jq90Var = new jq90(new lrm0(cVar, a), g6k0.b, null);
                    int i2 = DrawingView.h;
                    drawingView.e(jq90Var, null);
                } else if (i == 2) {
                    float a2 = ccu.a(f);
                    y8g.c cVar2 = new y8g.c(z5gVar.a);
                    Paint.Style style2 = Paint.Style.STROKE;
                    jq90 jq90Var2 = new jq90(new lrm0(cVar2, a2), new ofy0(new eq90[]{g6k0.b, new ArrowPathCalculator(a2 * 5)}, 5), null);
                    int i3 = DrawingView.h;
                    drawingView.e(jq90Var2, null);
                } else if (i == 3) {
                    int i4 = ccu.c;
                    float f2 = ((i4 - r2) * f) + ccu.b;
                    int i5 = ccu.e;
                    nmb0 nmb0Var = new nmb0(new gif0(new kif0(f2, (f * (i5 - r4)) + ccu.d), new y8g.c(z5gVar.a), 0.8f), new kx90(), null);
                    int i6 = DrawingView.h;
                    drawingView.e(nmb0Var, null);
                } else if (i == 4) {
                    float a3 = ccu.a(f);
                    y8g.c cVar3 = new y8g.c(z5gVar.a);
                    Paint.Style style3 = Paint.Style.STROKE;
                    jq90 jq90Var3 = new jq90(new t2u(ccu.f, cVar3, a3, a3 * 1.4f, a3 / 2.0f), g6k0.b, null);
                    int i7 = DrawingView.h;
                    drawingView.e(jq90Var3, null);
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jq90 jq90Var4 = new jq90(new uup(ccu.a(f)), g6k0.b, null);
                    int i8 = DrawingView.h;
                    drawingView.e(jq90Var4, null);
                }
                return s3q0.a;
            case 6:
                xzp0 xzp0Var = (xzp0) obj;
                izs<? super xzp0, s3q0> izsVar = ((of10) this.receiver).c;
                if (izsVar != null) {
                    izsVar.invoke(xzp0Var);
                }
                return s3q0.a;
            case 7:
                ((hm50) this.receiver).a((vl50) obj);
                return s3q0.a;
            case 8:
                ((dv60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 11:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 12:
                fam0 fam0Var = (fam0) obj;
                gpj0 gpj0Var = ((y9m0) this.receiver).d;
                StoryPrivacyType storyPrivacyType = fam0Var.c;
                List<UserId> list = fam0Var.d;
                List<UserId> list2 = fam0Var.e;
                StoryPrivacyType storyPrivacyType2 = fam0Var.b;
                int i9 = storyPrivacyType != null ? y9m0.a.$EnumSwitchMapping$0[storyPrivacyType.ordinal()] : -1;
                if (i9 == 1) {
                    StoryPrivacyType storyPrivacyType3 = StoryPrivacyType.ONLY_ME;
                    aVar = new w9m0.a(storyPrivacyType3, storyPrivacyType2 == storyPrivacyType3, false, null, null, null, null, 0, 348);
                } else if (i9 == 2) {
                    StoryPrivacyType storyPrivacyType4 = StoryPrivacyType.FRIENDS_OF_FRIENDS;
                    aVar = new w9m0.a(storyPrivacyType4, storyPrivacyType2 == storyPrivacyType4, false, null, null, new a9m0.a(storyPrivacyType4), null, 0, 476);
                } else if (i9 == 3) {
                    StoryPrivacyType storyPrivacyType5 = StoryPrivacyType.SOME;
                    aVar = new w9m0.a(storyPrivacyType5, storyPrivacyType2 == storyPrivacyType5, false, fam0Var.i, null, new a9m0.a(storyPrivacyType5), a9m0.d.b, fam0Var.f.size(), 148);
                }
                w9m0.b bVar = new w9m0.b();
                StoryPrivacyType storyPrivacyType6 = StoryPrivacyType.ALL;
                w9m0.a aVar2 = new w9m0.a(storyPrivacyType6, storyPrivacyType2 == storyPrivacyType6, gpj0Var.d(), null, null, gpj0Var.d() ? a9m0.g.b : new a9m0.a(storyPrivacyType6), null, 0, 472);
                StoryPrivacyType storyPrivacyType7 = StoryPrivacyType.FRIENDS;
                w9m0.a aVar3 = new w9m0.a(storyPrivacyType7, storyPrivacyType2 == storyPrivacyType7, false, null, null, new a9m0.a(storyPrivacyType7), null, 0, 476);
                StoryPrivacyType storyPrivacyType8 = StoryPrivacyType.BEST_FRIENDS;
                List<ayv0> list3 = fam0Var.g;
                int size = list.size();
                boolean z = storyPrivacyType2 == storyPrivacyType8;
                a9m0 a9m0Var = a9m0.e.b;
                return rl3.I(new w9m0[]{bVar, aVar2, aVar3, new w9m0.a(storyPrivacyType8, z, false, list3, a9m0Var, list.isEmpty() ? a9m0Var : new a9m0.a(storyPrivacyType8), null, size, 196), aVar, new w9m0.a(StoryPrivacyType.EXCLUDED, false, false, fam0Var.h, new a9m0.f(list2), new a9m0.f(list2), null, list2.size(), 198)});
            case 13:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 14:
                ((ggu0) this.receiver).m().g.g(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 15:
                ((wzh0) this.receiver).n((set0) obj);
                return s3q0.a;
            default:
                lgv0 lgv0Var = (lgv0) this.receiver;
                lgv0Var.getClass();
                Intent intent = new Intent();
                intent.putExtra("user_id", ((WebUserShortInfo) obj).b);
                lgv0Var.kn().setResult(-1, intent);
                lgv0Var.kn().finish();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, d8e.class, "sendFeedAction", "sendFeedAction(Lcom/vk/clips/sdk/shared/feed/controller/mvi/FeedAction;)V", 0);
                break;
            case 3:
            case 6:
            case 7:
            default:
                break;
            case 4:
                super(1, obj, f1i.class, "onSelectLocation", "onSelectLocation(Lcom/vk/search/params/api/domain/model/SearchLocation;)V", 0);
                break;
            case 5:
                super(1, obj, ccu.class, "startDrawing", "startDrawing(Lcom/vk/attachpicker/impl/graffiti/domain/model/DrawConfiguration;)V", 0);
                break;
            case 8:
                super(1, obj, dv60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, y9m0.class, "buildItems", "buildItems(Lcom/vk/camera/editor/stories/impl/privacy/mvi/StoryPrivacyState;)Ljava/util/List;", 0);
                break;
            case 13:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o99(m99 m99Var) {
        super(1, m99Var, m99.class, "onAddToFriendsError", "onAddToFriendsError(Ljava/lang/Throwable;)V", 0);
        this.b = 0;
    }
}
