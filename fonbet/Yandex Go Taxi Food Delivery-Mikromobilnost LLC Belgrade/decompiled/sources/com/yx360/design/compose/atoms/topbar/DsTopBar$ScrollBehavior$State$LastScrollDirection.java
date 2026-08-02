package com.yx360.design.compose.atoms.topbar;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yx360/design/compose/atoms/topbar/DsTopBar$ScrollBehavior$State$LastScrollDirection", "", "Lcom/yx360/design/compose/atoms/topbar/DsTopBar$ScrollBehavior$State$LastScrollDirection;", "Up", "Down", "None", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTopBar$ScrollBehavior$State$LastScrollDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsTopBar$ScrollBehavior$State$LastScrollDirection[] $VALUES;
    public static final DsTopBar$ScrollBehavior$State$LastScrollDirection Down;
    public static final DsTopBar$ScrollBehavior$State$LastScrollDirection None;
    public static final DsTopBar$ScrollBehavior$State$LastScrollDirection Up;

    static {
        DsTopBar$ScrollBehavior$State$LastScrollDirection dsTopBar$ScrollBehavior$State$LastScrollDirection = new DsTopBar$ScrollBehavior$State$LastScrollDirection("Up", 0);
        Up = dsTopBar$ScrollBehavior$State$LastScrollDirection;
        DsTopBar$ScrollBehavior$State$LastScrollDirection dsTopBar$ScrollBehavior$State$LastScrollDirection2 = new DsTopBar$ScrollBehavior$State$LastScrollDirection("Down", 1);
        Down = dsTopBar$ScrollBehavior$State$LastScrollDirection2;
        DsTopBar$ScrollBehavior$State$LastScrollDirection dsTopBar$ScrollBehavior$State$LastScrollDirection3 = new DsTopBar$ScrollBehavior$State$LastScrollDirection("None", 2);
        None = dsTopBar$ScrollBehavior$State$LastScrollDirection3;
        DsTopBar$ScrollBehavior$State$LastScrollDirection[] dsTopBar$ScrollBehavior$State$LastScrollDirectionArr = {dsTopBar$ScrollBehavior$State$LastScrollDirection, dsTopBar$ScrollBehavior$State$LastScrollDirection2, dsTopBar$ScrollBehavior$State$LastScrollDirection3};
        $VALUES = dsTopBar$ScrollBehavior$State$LastScrollDirectionArr;
        $ENTRIES = kotlin.enums.a.a(dsTopBar$ScrollBehavior$State$LastScrollDirectionArr);
    }

    public static DsTopBar$ScrollBehavior$State$LastScrollDirection valueOf(String str) {
        return (DsTopBar$ScrollBehavior$State$LastScrollDirection) Enum.valueOf(DsTopBar$ScrollBehavior$State$LastScrollDirection.class, str);
    }

    public static DsTopBar$ScrollBehavior$State$LastScrollDirection[] values() {
        return (DsTopBar$ScrollBehavior$State$LastScrollDirection[]) $VALUES.clone();
    }
}
