package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallPostPrimaryAttachmentsModeDto;
import com.vk.api.generated.wall.dto.WallPostResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WallPostApiRequest.kt */
/* loaded from: classes4.dex */
public final class v9x0 extends awi<NewsEntry> {
    public static final List<BaseUserGroupFieldsDto> t = e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.DOMAIN, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRUST_MARK);
    public final bax0 s;

    public v9x0(bax0 bax0Var) {
        this.s = bax0Var;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        String str;
        WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto;
        max0 max0Var = new max0();
        bax0 bax0Var = this.s;
        UserId userId = bax0Var.a;
        if (!fkq0.c(userId)) {
            userId = null;
        }
        String str2 = bax0Var.b;
        List<String> list = bax0Var.c;
        if (list.isEmpty()) {
            list = null;
        }
        List<String> list2 = list;
        Boolean bool = bax0Var.d;
        Boolean bool2 = bax0Var.e;
        Boolean bool3 = bax0Var.f ? Boolean.FALSE : null;
        boolean z = bax0Var.g;
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        boolean z2 = bax0Var.h;
        Boolean valueOf2 = Boolean.valueOf(z2);
        if (!z2) {
            valueOf2 = null;
        }
        boolean z3 = bax0Var.i;
        boolean z4 = bax0Var.j;
        boolean z5 = bax0Var.k;
        boolean z6 = bax0Var.N;
        Boolean valueOf3 = z6 ? Boolean.valueOf(z6) : null;
        boolean z7 = bax0Var.l;
        Integer num = bax0Var.m;
        Double d = bax0Var.n;
        Float valueOf4 = d != null ? Float.valueOf((float) d.doubleValue()) : null;
        Double d2 = bax0Var.o;
        Float f = valueOf4;
        Float valueOf5 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
        Integer num2 = bax0Var.p;
        Float f2 = valueOf5;
        String str3 = bax0Var.A;
        String str4 = bax0Var.q;
        Integer num3 = bax0Var.r;
        Long l = bax0Var.R;
        Integer valueOf6 = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Integer num4 = bax0Var.S;
        String str5 = bax0Var.T;
        PostingPrimaryMode postingPrimaryMode = bax0Var.u;
        if (postingPrimaryMode != null) {
            int i = w9x0.$EnumSwitchMapping$0[postingPrimaryMode.ordinal()];
            str = str5;
            if (i == 1) {
                wallPostPrimaryAttachmentsModeDto = WallPostPrimaryAttachmentsModeDto.CAROUSEL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                wallPostPrimaryAttachmentsModeDto = WallPostPrimaryAttachmentsModeDto.GRID;
            }
        } else {
            str = str5;
            wallPostPrimaryAttachmentsModeDto = null;
        }
        Boolean bool4 = valueOf;
        String str6 = bax0Var.s;
        UserId userId2 = userId;
        Boolean bool5 = valueOf2;
        String str7 = bax0Var.t;
        WallPostPrimaryAttachmentsModeDto wallPostPrimaryAttachmentsModeDto2 = wallPostPrimaryAttachmentsModeDto;
        String str8 = bax0Var.w;
        String str9 = bax0Var.x;
        String str10 = bax0Var.y;
        String str11 = bax0Var.z;
        String str12 = bax0Var.B;
        String str13 = bax0Var.C;
        Integer num5 = bax0Var.O;
        dz2 x = yfb.x(lax0.n(max0Var, userId2, bool4, bool5, bool, str2, list2, bax0Var.V, str6, str7, wallPostPrimaryAttachmentsModeDto2, bax0Var.U, bool2, bool3, num, f, f2, num2, bax0Var.P, str3, bax0Var.Q, str13, bax0Var.H, str8, str9, str10, str11, Boolean.valueOf(z3), num3, valueOf6, num4, str, Boolean.valueOf(z4), bax0Var.W, bax0Var.X, bax0Var.Y, str4, str12, bax0Var.E, bax0Var.F, bax0Var.v, Boolean.valueOf(z5), bax0Var.G, valueOf3, Boolean.valueOf(z7), num5, 20975680, 526080));
        String str14 = bax0Var.D;
        if (str14 != null) {
            if (str14.length() <= 0) {
                str14 = null;
            }
            if (str14 != null) {
                x.K("track_code", str14);
            }
        }
        WallPostResponseDto wallPostResponseDto = (WallPostResponseDto) x.f(l7r0Var);
        UserId userId3 = bax0Var.a;
        UserId userId4 = fkq0.c(userId3) ? userId3 : null;
        if (userId4 == null) {
            userId4 = o25.a().c();
        }
        UserId userId5 = userId4;
        StringBuilder sb = new StringBuilder();
        sb.append(userId5.b);
        sb.append('_');
        sb.append(wallPostResponseDto.d());
        return (NewsEntry) yfb.z(max0Var.h(Collections.singletonList(sb.toString()), t), new yyq0(4, userId5, wallPostResponseDto)).f(l7r0Var);
    }
}
