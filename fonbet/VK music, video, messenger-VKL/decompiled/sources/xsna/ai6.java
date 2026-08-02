package xsna;

import android.content.Context;
import android.content.pm.Signature;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.database.dto.DatabaseGetSchoolsResponseDto;
import com.vk.api.generated.database.dto.DatabaseSchoolDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.dto.common.id.UserId;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.method.selector.impl.a;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.voip.ui.view.VoipActionMultiLineView;
import com.vkontakte.android.R;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xn50;

/* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai6 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.method.selector.impl.a cVar;
        boolean z;
        switch (this.b) {
            case 0:
                lw4 lw4Var = (lw4) obj;
                com.vk.music.notifications.restriction.a aVar = (com.vk.music.notifications.restriction.a) this.receiver;
                aVar.getClass();
                bn40.f(lw4Var);
                aVar.b.K(lw4Var.a());
                i0q0.f(new com.vk.catalog2.common.ui.holders.a(4, aVar, lw4Var));
                return s3q0.a;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                ke8 ke8Var = (ke8) this.receiver;
                VoipActionMultiLineView voipActionMultiLineView = ke8Var.s;
                voipActionMultiLineView.setSubtitle(charSequence);
                Context context = ke8Var.a;
                voipActionMultiLineView.setContentDescription(context.getString(R.string.voip_accessibility_record, context.getString(R.string.voip_broadcast_privacy_label), charSequence));
                return s3q0.a;
            case 2:
                ((j4e) this.receiver).getClass();
                return Boolean.valueOf(((ClipsFavoritesFolderRenamingState) obj).b.length() > 0);
            case 3:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 4:
                ((z37) this.receiver).b((cro) obj);
                return s3q0.a;
            case 5:
                vgg vggVar = (vgg) obj;
                com.vk.method.selector.impl.b bVar = (com.vk.method.selector.impl.b) this.receiver;
                bVar.getClass();
                Throwable th = vggVar.a;
                if ((th instanceof IOException) || (((z = th instanceof VKApiExecutionException)) && ((VKApiExecutionException) th).s() == -1)) {
                    cVar = new a.AbstractC1275a.c(vggVar);
                } else if (z) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    cVar = f35.b(vKApiExecutionException) ? new a.AbstractC1275a.b(vggVar) : f35.c(vKApiExecutionException) ? new a.AbstractC1275a.d(vggVar) : new a.AbstractC1275a.C1276a(vggVar);
                } else {
                    cVar = new a.AbstractC1275a.e(vggVar);
                }
                bVar.o = cVar;
                MethodSelectorView methodSelectorView = bVar.h;
                if (methodSelectorView != null) {
                    methodSelectorView.setState(cVar);
                }
                com.vk.method.selector.impl.c cVar2 = bVar.p;
                cVar2.a = bVar.o;
                cVar2.getClass();
                com.vk.method.selector.impl.c.b(cVar2, new kn0(com.vk.registration.funnels.b.a, 1), 6);
                return s3q0.a;
            case 6:
                yc50 yc50Var = (yc50) this.receiver;
                yc50Var.getClass();
                xn50.a.c(yc50Var, (lc50) obj);
                return s3q0.a;
            case 7:
                ((vn60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((cpu) this.receiver).d((UserId) obj));
            case 9:
                DatabaseGetSchoolsResponseDto databaseGetSchoolsResponseDto = (DatabaseGetSchoolsResponseDto) obj;
                ((t9h0) this.receiver).getClass();
                int count = databaseGetSchoolsResponseDto.getCount();
                List<DatabaseSchoolDto> d = databaseGetSchoolsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (DatabaseSchoolDto databaseSchoolDto : d) {
                    Integer d2 = databaseSchoolDto.d();
                    int intValue = d2 != null ? d2.intValue() : -1;
                    String title = databaseSchoolDto.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    arrayList.add(new School(drm0.p0(title).toString(), intValue));
                }
                return new jwk(count, arrayList);
            case 10:
                bnj0 bnj0Var = (bnj0) this.receiver;
                bnj0 bnj0Var2 = bnj0.a;
                bnj0Var.getClass();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(((Signature) obj).toByteArray());
                byte[] digest = messageDigest.digest();
                return String.format(vu5.b(new StringBuilder("%0"), digest.length << 1, 'X'), Arrays.copyOf(new Object[]{new BigInteger(1, digest)}, 1)).toLowerCase(Locale.ENGLISH);
            default:
                return ((q73) this.receiver).d((AppsMiniappsCatalogDto) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(com.vk.music.notifications.restriction.a aVar) {
        super(1, aVar, com.vk.music.notifications.restriction.a.class, "showRestrictionPopup", "showRestrictionPopup(Lcom/vk/music/offline/configs/api/domain/model/AudioRestrictionInfo;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(Object obj, int i) {
        super(1, obj, j4e.class, "mapIsSaveButtonEnabled", "mapIsSaveButtonEnabled(Lcom/vk/clips/favorites/impl/ui/folders/renaming/ClipsFavoritesFolderRenamingState;)Z", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, com.vk.method.selector.impl.b.class, "handleGetVerificationMethodError", "handleGetVerificationMethodError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
                break;
            case 6:
            case 7:
            default:
                break;
            case 8:
                super(1, obj, cpu.class, "isCurrentUserOrGroupAdmin", "isCurrentUserOrGroupAdmin(Lcom/vk/dto/common/id/UserId;)Z", 0);
                break;
            case 9:
                super(1, obj, t9h0.class, "mapResponseToItems", "mapResponseToItems(Lcom/vk/api/generated/database/dto/DatabaseGetSchoolsResponseDto;)Lcom/vk/search/params/impl/domain/model/database/DatabaseItems;", 0);
                break;
        }
    }
}
