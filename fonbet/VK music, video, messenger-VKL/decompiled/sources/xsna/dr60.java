package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.List;
import kotlin.Pair;
import org.chromium.base.version_info.VersionConstants;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ds60;
import xsna.k8q0;
import xsna.xa60;

/* compiled from: NewsfeedListNotificationCenterListener.kt */
/* loaded from: classes4.dex */
public final class dr60 implements bd70<Object> {
    public final bk30 b;

    public dr60(bk30 bk30Var) {
        this.b = bk30Var;
    }

    public final void a(NewsfeedExternalAction.c cVar) {
        this.b.invoke(new ds60.b(cVar));
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (i) {
            case 100:
            case 138:
                a(new NewsfeedExternalAction.c.r((NewsEntry) obj));
                break;
            case 101:
            case 102:
            case 104:
            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 146:
                NewsEntry newsEntry = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                k8q0 k8q0Var = i2 == 100 ? k8q0.a.a : k8q0.b.a;
                if (newsEntry == null) {
                    com.vk.metrics.eventtracking.b.a.a(new Exception(lhg.a(i, "entry is null, eventType = ")));
                    break;
                } else {
                    a(new NewsfeedExternalAction.c.f0(newsEntry, k8q0Var));
                    break;
                }
            case 103:
                a(new NewsfeedExternalAction.c.u((UserId) obj));
                break;
            case 105:
                a(new NewsfeedExternalAction.c.m((NewsEntry) obj));
                break;
            case ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED /* 107 */:
                a(new NewsfeedExternalAction.c.g0((u0q) obj));
                break;
            case 111:
                a(new NewsfeedExternalAction.c.i0((JSONObject) obj));
                break;
            case 112:
            case INVALID_INDEX_URL_VALUE:
                a(new NewsfeedExternalAction.c.f0((NewsEntry) obj));
                break;
            case 113:
                if (i2 != 100) {
                    a(new NewsfeedExternalAction.c.k0((Photo) obj));
                    break;
                } else {
                    a(new NewsfeedExternalAction.c.l0((Photo) obj));
                    break;
                }
            case 116:
                zeg zegVar = (zeg) obj;
                a(new NewsfeedExternalAction.c.l(zegVar.c, zegVar.b, zegVar.a));
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                a(new NewsfeedExternalAction.c.j0((NewsEntry) obj));
                break;
            case JSON_ENCODE_ERROR_VALUE:
                a(new NewsfeedExternalAction.c.j((NewsEntryWithAttachments) obj));
                break;
            case 120:
                a(new NewsfeedExternalAction.c.h0((Attachment) obj));
                break;
            case TPAT_ERROR_VALUE:
                a(new NewsfeedExternalAction.c.t((Attachment) obj));
                break;
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                a(new NewsfeedExternalAction.c.b((Post) obj));
                break;
            case 125:
                a(new NewsfeedExternalAction.c.e0((Post) obj));
                break;
            case 128:
                a(new NewsfeedExternalAction.c.g((NewsEntry) obj));
                break;
            case 129:
                a(new NewsfeedExternalAction.c.s((Post) obj));
                break;
            case 130:
                Photo photo = (Photo) obj;
                a(new NewsfeedExternalAction.c.i(photo, photo.e));
                break;
            case MRAID_JS_WRITE_FAILED_VALUE:
                a(new NewsfeedExternalAction.c.h((Photo) obj));
                break;
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                a(new NewsfeedExternalAction.c.f0(((lb60) obj).a));
                break;
            case 134:
                a(new NewsfeedExternalAction.c.d0((Post) obj));
                break;
            case 135:
                Pair pair = (Pair) obj;
                a(new NewsfeedExternalAction.c.x((NewsEntry) pair.d(), (NewsEntry) pair.g()));
                break;
            case 139:
                a(new NewsfeedExternalAction.c.a0((NewsEntry) obj));
                break;
            case VersionConstants.PRODUCT_MAJOR_VERSION /* 140 */:
                a(new NewsfeedExternalAction.c.f(((Boolean) obj).booleanValue()));
                break;
            case 141:
                a(new NewsfeedExternalAction.c.b0((Post) obj));
                break;
            case 143:
                a(new NewsfeedExternalAction.c.q((UserId) obj));
                break;
            case 144:
                a(new NewsfeedExternalAction.c.k((DzenNews) obj));
                break;
            case 145:
                a(new NewsfeedExternalAction.c.v((List) obj));
                break;
            case 147:
                xa60 xa60Var = (xa60) obj;
                NewsEntry newsEntry2 = xa60Var.a;
                xa60.a aVar = xa60Var.b;
                a(new NewsfeedExternalAction.c.e(newsEntry2, aVar != null ? aVar.a : null, aVar != null ? Integer.valueOf(aVar.b) : null, aVar != null ? Integer.valueOf(aVar.c) : null, xa60Var.c));
                break;
            case 148:
                a(new com.vk.newsfeed.presentation.model.actions.a((NewsEntry) obj));
                break;
            case 152:
                a((NewsfeedExternalAction.c.w) obj);
                break;
        }
    }
}
