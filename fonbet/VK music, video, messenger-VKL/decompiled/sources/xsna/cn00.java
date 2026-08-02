package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.common.domain.model.LikableItemType;
import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.AddLikeActionEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.DeleteLikeActionEntity;
import com.vk.newsfeed.impl.data.database.entity.action.post.a;
import com.vk.newsfeed.impl.domain.model.ActionWithOfflineSupportType;
import com.vk.newsfeed.impl.domain.model.SyncStatus;
import io.jsonwebtoken.JwtParser;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Mappers.kt */
/* loaded from: classes4.dex */
public final class cn00 {

    /* compiled from: Mappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ActionWithOfflineSupportTypeEntity.values().length];
            try {
                iArr[ActionWithOfflineSupportTypeEntity.ADD_LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionWithOfflineSupportTypeEntity.DELETE_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionWithOfflineSupportType.values().length];
            try {
                iArr2[ActionWithOfflineSupportType.ADD_LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ActionWithOfflineSupportType.DELETE_LIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SyncStatusEntity.values().length];
            try {
                iArr3[SyncStatusEntity.NOT_SYNCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SyncStatusEntity.SYNC_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SyncStatusEntity.SYNCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SyncStatus.values().length];
            try {
                iArr4[SyncStatus.NOT_SYNCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[SyncStatus.SYNC_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[SyncStatus.SYNCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final x60 a(a70 a70Var) {
        Object addLikeAction;
        AddLikeAction.TriggerType triggerType;
        ActionWithOfflineSupportType actionWithOfflineSupportType;
        SyncStatus syncStatus;
        long j = a70Var.a;
        Object obj = a70Var.b;
        ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity = a70Var.c;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[actionWithOfflineSupportTypeEntity.ordinal()];
        AddLikeAction.TriggerType triggerType2 = null;
        if (i == 1) {
            AddLikeActionEntity addLikeActionEntity = (AddLikeActionEntity) obj;
            LikableItemType b = com.vk.newsfeed.impl.data.database.entity.action.post.a.b(addLikeActionEntity.i());
            long g = addLikeActionEntity.g();
            Long j2 = addLikeActionEntity.j();
            UserId userId = j2 != null ? new UserId(j2.longValue()) : null;
            Integer k = addLikeActionEntity.k();
            String d = addLikeActionEntity.d();
            String l = addLikeActionEntity.l();
            String r = addLikeActionEntity.r();
            AddLikeActionEntity.TriggerTypeEntity n = addLikeActionEntity.n();
            if (n != null) {
                int i2 = a.C1378a.$EnumSwitchMapping$1[n.ordinal()];
                if (i2 == 1) {
                    triggerType = AddLikeAction.TriggerType.BUTTON;
                } else if (i2 == 2) {
                    triggerType = AddLikeAction.TriggerType.DOUBLE_TAP;
                } else if (i2 == 3) {
                    triggerType = AddLikeAction.TriggerType.REACTIONS_MODAL;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    triggerType = AddLikeAction.TriggerType.REACTIONS_POPUP;
                }
                triggerType2 = triggerType;
            }
            addLikeAction = new AddLikeAction(b, g, userId, k, d, l, r, triggerType2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            DeleteLikeActionEntity deleteLikeActionEntity = (DeleteLikeActionEntity) obj;
            LikableItemType b2 = com.vk.newsfeed.impl.data.database.entity.action.post.a.b(deleteLikeActionEntity.i());
            long g2 = deleteLikeActionEntity.g();
            Long j3 = deleteLikeActionEntity.j();
            addLikeAction = new dvl(b2, g2, j3 != null ? new UserId(j3.longValue()) : null, deleteLikeActionEntity.d(), deleteLikeActionEntity.k(), deleteLikeActionEntity.r());
        }
        int i3 = iArr[actionWithOfflineSupportTypeEntity.ordinal()];
        if (i3 == 1) {
            actionWithOfflineSupportType = ActionWithOfflineSupportType.ADD_LIKE;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            actionWithOfflineSupportType = ActionWithOfflineSupportType.DELETE_LIKE;
        }
        int i4 = a.$EnumSwitchMapping$2[a70Var.d.ordinal()];
        if (i4 == 1) {
            syncStatus = SyncStatus.NOT_SYNCED;
        } else if (i4 == 2) {
            syncStatus = SyncStatus.SYNC_IN_PROGRESS;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            syncStatus = SyncStatus.SYNCED;
        }
        if (a70Var.e != null) {
            int i5 = iArr[actionWithOfflineSupportTypeEntity.ordinal()];
            if (i5 == 1) {
                throw new UnsupportedOperationException("Mapper isn't defined.");
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new UnsupportedOperationException("Mapper isn't defined.");
        }
        if (a70Var.f == null) {
            return new x60(j, addLikeAction, actionWithOfflineSupportType, syncStatus, a70Var.g);
        }
        int i6 = iArr[actionWithOfflineSupportTypeEntity.ordinal()];
        if (i6 == 1) {
            throw new UnsupportedOperationException("Mapper isn't defined.");
        }
        if (i6 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new UnsupportedOperationException("Mapper isn't defined.");
    }

    public static final ActionWithOfflineSupportTypeEntity b(ActionWithOfflineSupportType actionWithOfflineSupportType) {
        int i = a.$EnumSwitchMapping$1[actionWithOfflineSupportType.ordinal()];
        if (i == 1) {
            return ActionWithOfflineSupportTypeEntity.ADD_LIKE;
        }
        if (i == 2) {
            return ActionWithOfflineSupportTypeEntity.DELETE_LIKE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ActionWithOfflineSupportTypeEntity c(String str) {
        ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity = ActionWithOfflineSupportTypeEntity.ADD_LIKE;
        if (str.equals(actionWithOfflineSupportTypeEntity.h())) {
            return actionWithOfflineSupportTypeEntity;
        }
        ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity2 = ActionWithOfflineSupportTypeEntity.DELETE_LIKE;
        if (str.equals(actionWithOfflineSupportTypeEntity2.h())) {
            return actionWithOfflineSupportTypeEntity2;
        }
        throw new Exception(air.b(JwtParser.SEPARATOR_CHAR, "Unknown action type ", str));
    }

    public static final SyncStatusEntity d(String str) {
        SyncStatusEntity syncStatusEntity = SyncStatusEntity.NOT_SYNCED;
        if (str.equals(syncStatusEntity.h())) {
            return syncStatusEntity;
        }
        SyncStatusEntity syncStatusEntity2 = SyncStatusEntity.SYNC_IN_PROGRESS;
        if (str.equals(syncStatusEntity2.h())) {
            return syncStatusEntity2;
        }
        SyncStatusEntity syncStatusEntity3 = SyncStatusEntity.SYNCED;
        if (str.equals(syncStatusEntity3.h())) {
            return syncStatusEntity3;
        }
        throw new Exception(air.b(JwtParser.SEPARATOR_CHAR, "Unknown sync status ", str));
    }
}
