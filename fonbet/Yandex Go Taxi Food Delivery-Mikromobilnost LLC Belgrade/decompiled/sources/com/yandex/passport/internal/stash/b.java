package com.yandex.passport.internal.stash;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class b {
    public static StashCell a(String str) {
        for (StashCell stashCell : StashCell.values()) {
            if (jl40.l(stashCell.getValue(), str)) {
                return stashCell;
            }
        }
        return null;
    }
}
