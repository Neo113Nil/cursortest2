package com.yandex.div.core.downloader;

import com.yandex.div.DivDataTag;
import com.yandex.div2.a;
import java.util.List;
import xsna.zk3;

/* compiled from: DivPatchCache.kt */
/* loaded from: classes7.dex */
public class DivPatchCache {
    private final zk3<DivDataTag, DivPatchMap> patches = new zk3<>();

    public DivPatchMap getPatch(DivDataTag divDataTag) {
        return this.patches.get(divDataTag);
    }

    public List<a> getPatchDivListById(DivDataTag divDataTag, String str) {
        DivPatchMap divPatchMap = this.patches.get(divDataTag);
        if (divPatchMap == null) {
            return null;
        }
        return divPatchMap.getPatches().get(str);
    }
}
