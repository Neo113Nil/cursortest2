package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;
import defpackage.cvu0;

/* loaded from: classes3.dex */
public final class a {
    public static PrerequisiteParam.TransfersPagePrerequisiteType a(String str) {
        for (PrerequisiteParam.TransfersPagePrerequisiteType transfersPagePrerequisiteType : PrerequisiteParam.TransfersPagePrerequisiteType.values()) {
            if (cvu0.t(transfersPagePrerequisiteType.name(), str, true)) {
                return transfersPagePrerequisiteType;
            }
        }
        return null;
    }
}
