package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ImSearchRepositoryResult.kt */
/* loaded from: classes2.dex */
public abstract class gcw {
    public final ImSearchLocalRequestLoggingInfo a;

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class a extends gcw {
        public final List<q2a0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends q2a0> list, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
            super(imSearchLocalRequestLoggingInfo);
            this.b = list;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class b extends gcw {
        public final List<Dialog> b;
        public final Object c;
        public final ProfilesSimpleInfo d;

        public b(List<Dialog> list, Map<Long, Boolean> map, ProfilesSimpleInfo profilesSimpleInfo, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
            super(imSearchLocalRequestLoggingInfo);
            this.b = list;
            this.c = map;
            this.d = profilesSimpleInfo;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class c extends gcw {
        public final ArrayList b;
        public final HashMap c;
        public final ProfilesSimpleInfo d;

        public c(ArrayList arrayList, HashMap hashMap, ProfilesSimpleInfo profilesSimpleInfo, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
            super(imSearchLocalRequestLoggingInfo);
            this.b = arrayList;
            this.c = hashMap;
            this.d = profilesSimpleInfo;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class d extends gcw {
        public final List<zpp<User>> b;
        public final ProfilesSimpleInfo c;

        public d(List<zpp<User>> list, ProfilesSimpleInfo profilesSimpleInfo) {
            super(null);
            this.b = list;
            this.c = profilesSimpleInfo;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class e extends gcw {
        public final ArrayList b;
        public final HashMap c;
        public final ProfilesSimpleInfo d;

        public e(ArrayList arrayList, HashMap hashMap, ProfilesSimpleInfo profilesSimpleInfo, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
            super(imSearchLocalRequestLoggingInfo);
            this.b = arrayList;
            this.c = hashMap;
            this.d = profilesSimpleInfo;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class f extends gcw {
        public final ArrayList b;
        public final HashMap c;
        public final ProfilesSimpleInfo d;

        public f(ArrayList arrayList, HashMap hashMap, ProfilesSimpleInfo profilesSimpleInfo, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
            super(imSearchLocalRequestLoggingInfo);
            this.b = arrayList;
            this.c = hashMap;
            this.d = profilesSimpleInfo;
        }
    }

    /* compiled from: ImSearchRepositoryResult.kt */
    public static final class g extends gcw {
        public final ArrayList b;

        public g(ArrayList arrayList) {
            super(null);
            this.b = arrayList;
        }
    }

    public gcw(ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
        this.a = imSearchLocalRequestLoggingInfo;
    }
}
