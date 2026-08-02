package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.wall.dto.WallGetByIdResponseDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WallArchive.kt */
/* loaded from: classes4.dex */
public final class e9x0 extends awi<Post> {
    public final n9x0 s;
    public final UserId t;
    public final int u;

    public e9x0(n9x0 n9x0Var, UserId userId, int i) {
        this.s = n9x0Var;
        this.t = userId;
        this.u = i;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        WallWallItemDto wallWallItemDto;
        max0 max0Var = new max0();
        tfx tfxVar = new tfx("wall.archive", new bz60(14), new oyh0(6));
        int i = this.u;
        tfx.l(tfxVar, "post_id", i, 0, 0, 8);
        if (((BaseOkResponseDto) yfb.x(tfxVar).f(l7r0Var)) == BaseOkResponseDto.OK) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.t.b);
            sb.append('_');
            sb.append(i);
            WallGetByIdResponseDto wallGetByIdResponseDto = (WallGetByIdResponseDto) yfb.x(lax0.c(max0Var, Collections.singletonList(sb.toString()), e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED), null, 52)).f(l7r0Var);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            n9x0 n9x0Var = this.s;
            n9x0Var.getClass();
            List<WallWallItemDto> e = wallGetByIdResponseDto.e();
            NewsEntry a = (e == null || (wallWallItemDto = (WallWallItemDto) j5g.a0(e)) == null) ? null : n9x0Var.a.a(wallWallItemDto, n9x0.c(wallGetByIdResponseDto.f()), n9x0.b(wallGetByIdResponseDto.d()), linkedHashMap);
            if (a != null && (a instanceof Post)) {
                return (Post) a;
            }
        }
        return null;
    }
}
