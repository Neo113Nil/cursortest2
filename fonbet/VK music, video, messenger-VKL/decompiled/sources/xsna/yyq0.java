package xsna;

import com.vk.api.generated.wall.dto.WallPostResponseDto;
import com.vk.api.parsers.BadgesParsers;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.parse.NewsfeedParseException;
import com.vk.imageloader.view.VKImageView;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.f;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yyq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yyq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageSize Cb;
        switch (this.b) {
            case 0:
                azq0 azq0Var = ((zyq0) this.c).b;
                List list = (List) this.d;
                if (epx.f((Boolean) obj, Boolean.TRUE)) {
                    azq0Var.a.g(false);
                    azq0Var.a.a(j5g.S0(list));
                }
                return s3q0.a;
            case 1:
                ((SearchUiComponent) ((k7m) m7m.f((b9s0) this.c)).a(fpf0.a(SearchUiComponent.class))).G9(((u4a) this.d).c.f, new SearchUiComponent.a.InterfaceC1776a.b(((Long) obj).longValue()));
                return s3q0.a;
            case 2:
                com.vk.video.profile.presentation.c cVar = (com.vk.video.profile.presentation.c) this.c;
                Pair pair = (Pair) obj;
                cVar.h.a(new h8t0(((u490) pair.i()).a.i(16), ((u490) pair.i()).a.b, ((c9t0) this.d).b instanceof VideoProfileSource.OwnProfile));
                cVar.T(new f.g.c((List) pair.j(), (u490) pair.i()));
                return s3q0.a;
            case 3:
                VKImageView vKImageView = (VKImageView) this.c;
                Image image = (Image) this.d;
                vKImageView.load((image == null || (Cb = image.Cb(((VKImageView) obj).getWidth(), true, false)) == null) ? null : Cb.getUrl());
                return s3q0.a;
            default:
                UserId userId = (UserId) this.c;
                WallPostResponseDto wallPostResponseDto = (WallPostResponseDto) this.d;
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("response");
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                Post post = null;
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    try {
                        post = p6c0.b(optJSONArray.getJSONObject(0), tci.r(jSONObject), BadgesParsers.b(jSONObject), vj90.e(jSONObject), 16);
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
                    }
                }
                if (post != null) {
                    return post;
                }
                throw new IllegalStateException(("WallPostApiRequest: null response for " + userId + '_' + wallPostResponseDto.d()).toString());
        }
    }
}
