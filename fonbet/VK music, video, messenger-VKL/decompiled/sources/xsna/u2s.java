package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.FolderType;
import kotlin.collections.builders.SetBuilder;

/* compiled from: FoldersSupportedTypesProvider.kt */
/* loaded from: classes2.dex */
public final class u2s {
    public final com.vk.im.engine.models.c a;

    /* compiled from: FoldersSupportedTypesProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FolderType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FolderType.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FolderType.PERSONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FolderType.MANAGED_GROUPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FolderType.UNREAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FolderType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public u2s(com.vk.im.engine.models.c cVar) {
        this.a = cVar;
    }

    public final SetBuilder a() {
        SetBuilder setBuilder = new SetBuilder();
        setBuilder.add(FolderType.DEFAULT);
        setBuilder.add(FolderType.CHANNELS);
        p4g.a(FolderType.BUSINESS, setBuilder, this.a.o());
        setBuilder.add(FolderType.PERSONAL);
        p4g.a(FolderType.MANAGED_GROUPS, setBuilder, BuildInfo.s());
        return setBuilder.d();
    }
}
