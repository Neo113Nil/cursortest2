package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallAttachmentsListAttachmentDto;
import com.vk.api.generated.wall.dto.WallEditPrimaryAttachmentsModeDto;
import com.vk.api.generated.wall.dto.WallEditResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.dto.PostingPrimaryMode;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WallEditApiRequest.kt */
/* loaded from: classes4.dex */
public final class j9x0 extends awi<NewsEntry> {
    public static final List<BaseUserGroupFieldsDto> t = e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.DOMAIN, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRUST_MARK);
    public final bax0 s;

    public j9x0(bax0 bax0Var) {
        this.s = bax0Var;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        Integer num;
        WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto;
        WallEditPrimaryAttachmentsModeDto wallEditPrimaryAttachmentsModeDto2;
        max0 max0Var = new max0();
        bax0 bax0Var = this.s;
        Integer num2 = bax0Var.I;
        if (num2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int intValue = num2.intValue();
        UserId userId = bax0Var.a;
        String str = bax0Var.b;
        List<String> list = bax0Var.c;
        List<WallAttachmentsListAttachmentDto> list2 = bax0Var.V;
        String str2 = bax0Var.U;
        String str3 = bax0Var.B;
        String str4 = bax0Var.C;
        Boolean bool = bax0Var.e;
        boolean z = bax0Var.i;
        boolean z2 = bax0Var.g;
        boolean z3 = bax0Var.h;
        Integer num3 = bax0Var.m;
        Double d = bax0Var.n;
        Float valueOf = d != null ? Float.valueOf((float) d.doubleValue()) : null;
        Double d2 = bax0Var.o;
        Float valueOf2 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
        Integer num4 = bax0Var.p;
        Float f = valueOf;
        String str5 = bax0Var.q;
        Integer num5 = bax0Var.r;
        Long l = bax0Var.R;
        Float f2 = valueOf2;
        Integer valueOf3 = l != null ? Integer.valueOf((int) l.longValue()) : null;
        Integer num6 = bax0Var.S;
        String str6 = bax0Var.T;
        Integer num7 = valueOf3;
        Boolean bool2 = bax0Var.f ? Boolean.FALSE : null;
        String str7 = bax0Var.s;
        Boolean bool3 = bool2;
        String str8 = bax0Var.t;
        List<UserId> list3 = bax0Var.v;
        String str9 = bax0Var.w;
        String str10 = bax0Var.z;
        PostingPrimaryMode postingPrimaryMode = bax0Var.u;
        if (postingPrimaryMode != null) {
            int i = k9x0.$EnumSwitchMapping$0[postingPrimaryMode.ordinal()];
            num = num6;
            if (i == 1) {
                wallEditPrimaryAttachmentsModeDto2 = WallEditPrimaryAttachmentsModeDto.CAROUSEL;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                wallEditPrimaryAttachmentsModeDto2 = WallEditPrimaryAttachmentsModeDto.GRID;
            }
            wallEditPrimaryAttachmentsModeDto = wallEditPrimaryAttachmentsModeDto2;
        } else {
            num = num6;
            wallEditPrimaryAttachmentsModeDto = null;
        }
        Boolean bool4 = bax0Var.Q;
        String str11 = bax0Var.E;
        String str12 = bax0Var.F;
        boolean z4 = bax0Var.j;
        Boolean bool5 = bax0Var.G;
        boolean z5 = bax0Var.k;
        boolean z6 = bax0Var.N;
        Boolean valueOf4 = Boolean.valueOf(z6);
        if (!z6) {
            valueOf4 = null;
        }
        dz2 x = yfb.x(lax0.l(max0Var, intValue, userId, Boolean.valueOf(z2), Boolean.valueOf(z3), str, list, list2, str7, str2, bool, bool3, num3, f, f2, num4, bool4, str11, str12, Boolean.valueOf(z), num5, num7, num, str6, bax0Var.W, bax0Var.X, bax0Var.Y, str5, str8, wallEditPrimaryAttachmentsModeDto, str4, str3, str9, str10, list3, Boolean.valueOf(z5), Boolean.valueOf(z4), bool5, valueOf4, bax0Var.O, 268435520, 0));
        x.K("skip_repost_to_story", bax0Var.l ? "1" : "0");
        WallEditResponseDto wallEditResponseDto = (WallEditResponseDto) x.f(l7r0Var);
        StringBuilder sb = new StringBuilder();
        sb.append(bax0Var.a.b);
        sb.append('_');
        sb.append(wallEditResponseDto.d());
        return (NewsEntry) yfb.z(max0Var.h(Collections.singletonList(sb.toString()), t), new kvm0(this, 22)).f(l7r0Var);
    }
}
