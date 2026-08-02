package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import java.util.ArrayList;
import java.util.List;
import xsna.fve;
import xsna.mue;

/* compiled from: ClipsPlaylistsSmallFoldersStateMapper.kt */
/* loaded from: classes16.dex */
public final class gve implements izs<fve.b, wow<mue>> {
    @Override // xsna.izs
    public final wow<mue> invoke(fve.b bVar) {
        List<ShortVideoPlaylistFullDto> list = bVar.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ShortVideoPlaylistFullDto shortVideoPlaylistFullDto : list) {
            arrayList.add(new mue.a(shortVideoPlaylistFullDto.getId(), shortVideoPlaylistFullDto.getTitle()));
        }
        return new wow<>(arrayList);
    }
}
