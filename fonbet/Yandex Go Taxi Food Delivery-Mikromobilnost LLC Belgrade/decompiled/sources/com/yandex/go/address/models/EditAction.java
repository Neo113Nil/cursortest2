package com.yandex.go.address.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tvl;
import defpackage.ukn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/address/models/EditAction;", "", "Companion", "ukn", "EDIT", "CLEAR", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final EditAction CLEAR;
    public static final ukn Companion;
    public static final EditAction EDIT;

    static {
        EditAction editAction = new EditAction("EDIT", 0);
        EDIT = editAction;
        EditAction editAction2 = new EditAction("CLEAR", 1);
        CLEAR = editAction2;
        EditAction[] editActionArr = {editAction, editAction2};
        $VALUES = editActionArr;
        $ENTRIES = kotlin.enums.a.a(editActionArr);
        Companion = new ukn();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(27));
    }

    public static EditAction valueOf(String str) {
        return (EditAction) Enum.valueOf(EditAction.class, str);
    }

    public static EditAction[] values() {
        return (EditAction[]) $VALUES.clone();
    }
}
