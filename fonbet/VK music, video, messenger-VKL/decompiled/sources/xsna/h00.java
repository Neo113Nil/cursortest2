package xsna;

import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;

/* compiled from: ActionEntitySerializerFactoryImpl.kt */
/* loaded from: classes.dex */
public final class h00 {

    /* compiled from: ActionEntitySerializerFactoryImpl.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }
}
