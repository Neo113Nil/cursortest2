package xsna;

import com.vk.api.generated.messages.dto.MessagesGetRecommendedFoldersResponseDto;
import com.vk.api.generated.messages.dto.MessagesRecommendedFolderDto;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.im.engine.models.dialogs.RecommendedFolder;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DialogsFoldersGetRecommendedCmd.kt */
/* loaded from: classes18.dex */
public final class kqm extends le6<List<? extends RecommendedFolder>> {
    public final List<FoldersSupportedType> b;
    public final boolean c = true;

    public kqm(List list) {
        this.b = list;
    }

    @Override // xsna.le6
    public final List<? extends RecommendedFolder> e(w2w w2wVar) {
        pdm c = w2wVar.I0().b().c();
        c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        tgl0 tgl0Var = c.b;
        long g = currentTimeMillis - tgl0Var.I0().k().g("recommended_folders_timestamp");
        long j = pdm.l;
        List<FoldersSupportedType> list = this.b;
        ArrayList arrayList = null;
        if (g <= j && tgl0Var.I0().k().getInt("recommended_folders_used_supported_types", 0) == pdm.m(list)) {
            try {
                byte[] b = tgl0Var.I0().k().b("recommended_folders");
                if (b != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    arrayList = Serializer.b.b(b, RecommendedFolder.class.getClassLoader());
                }
            } catch (Exception e) {
                L.j(e, "Recommended folders cache is out of date (class changed)");
            }
        }
        if (arrayList != null) {
            return arrayList;
        }
        List<MessagesRecommendedFolderDto> d = ((MessagesGetRecommendedFoldersResponseDto) bz2.c(new gf20(list, this.c), "MessagesGetRecommendedFoldersApiCmd")).d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
        for (MessagesRecommendedFolderDto messagesRecommendedFolderDto : d) {
            int id = messagesRecommendedFolderDto.getId();
            String d2 = messagesRecommendedFolderDto.d();
            FolderType.b bVar = FolderType.Companion;
            String i = messagesRecommendedFolderDto.e().i();
            bVar.getClass();
            arrayList2.add(new RecommendedFolder(id, d2, FolderType.b.a(i)));
        }
        pdm c2 = w2wVar.I0().b().c();
        c2.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        tgl0 tgl0Var2 = c2.b;
        rey k = tgl0Var2.I0().k();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
        k.k(Serializer.b.f(arrayList2), "recommended_folders");
        tgl0Var2.I0().k().putInt("recommended_folders_used_supported_types", pdm.m(list));
        tgl0Var2.I0().k().j("recommended_folders_timestamp", currentTimeMillis2);
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqm)) {
            return false;
        }
        kqm kqmVar = (kqm) obj;
        return epx.f(this.b, kqmVar.b) && this.c == kqmVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFoldersGetRecommendedCmd(supportedTypes=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
