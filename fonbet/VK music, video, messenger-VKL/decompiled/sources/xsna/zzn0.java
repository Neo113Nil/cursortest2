package xsna;

import com.vk.im.engine.models.attaches.MediaType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: TabsStatScreenMapper.kt */
/* loaded from: classes2.dex */
public final class zzn0 implements yzn0 {

    /* compiled from: TabsStatScreenMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.DOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.yzn0
    public final MobileOfficialAppsCoreNavStat$EventScreen a(txb txbVar) {
        if (!(txbVar instanceof c8v)) {
            return txbVar instanceof hxb ? MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_MEMBERS_ALL : MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        }
        int i = a.$EnumSwitchMapping$0[((c8v) txbVar).m.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE : MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_LINKS : MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_DOCS : MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_AUDIO : MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_VIDEO : MobileOfficialAppsCoreNavStat$EventScreen.IM_ATTACHES_PHOTO;
    }
}
