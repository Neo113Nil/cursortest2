package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ActionMetadata implements Serializable {
    private ExitMetadata exitMetadata;
    private LeaveRoundaboutMetadata leaveRoundaboutMetadata;
    private TurnMetadata turnMetadata;
    private UturnMetadata uturnMetadata;

    public static ActionMetadata fromExitMetadata(ExitMetadata exitMetadata) {
        if (exitMetadata == null) {
            ny61.g("Variant value \"exitMetadata\" cannot be null");
            return null;
        }
        ActionMetadata actionMetadata = new ActionMetadata();
        actionMetadata.exitMetadata = exitMetadata;
        return actionMetadata;
    }

    public static ActionMetadata fromLeaveRoundaboutMetadata(LeaveRoundaboutMetadata leaveRoundaboutMetadata) {
        if (leaveRoundaboutMetadata == null) {
            ny61.g("Variant value \"leaveRoundaboutMetadata\" cannot be null");
            return null;
        }
        ActionMetadata actionMetadata = new ActionMetadata();
        actionMetadata.leaveRoundaboutMetadata = leaveRoundaboutMetadata;
        return actionMetadata;
    }

    public static ActionMetadata fromTurnMetadata(TurnMetadata turnMetadata) {
        if (turnMetadata == null) {
            ny61.g("Variant value \"turnMetadata\" cannot be null");
            return null;
        }
        ActionMetadata actionMetadata = new ActionMetadata();
        actionMetadata.turnMetadata = turnMetadata;
        return actionMetadata;
    }

    public static ActionMetadata fromUturnMetadata(UturnMetadata uturnMetadata) {
        if (uturnMetadata == null) {
            ny61.g("Variant value \"uturnMetadata\" cannot be null");
            return null;
        }
        ActionMetadata actionMetadata = new ActionMetadata();
        actionMetadata.uturnMetadata = uturnMetadata;
        return actionMetadata;
    }

    public ExitMetadata getExitMetadata() {
        return this.exitMetadata;
    }

    public LeaveRoundaboutMetadata getLeaveRoundaboutMetadata() {
        return this.leaveRoundaboutMetadata;
    }

    public TurnMetadata getTurnMetadata() {
        return this.turnMetadata;
    }

    public UturnMetadata getUturnMetadata() {
        return this.uturnMetadata;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.uturnMetadata = (UturnMetadata) archive.add((Archive) this.uturnMetadata, true, (Class<Archive>) UturnMetadata.class);
        this.leaveRoundaboutMetadata = (LeaveRoundaboutMetadata) archive.add((Archive) this.leaveRoundaboutMetadata, true, (Class<Archive>) LeaveRoundaboutMetadata.class);
        this.turnMetadata = (TurnMetadata) archive.add((Archive) this.turnMetadata, true, (Class<Archive>) TurnMetadata.class);
        this.exitMetadata = (ExitMetadata) archive.add((Archive) this.exitMetadata, true, (Class<Archive>) ExitMetadata.class);
    }
}
