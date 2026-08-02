package xsna;

import android.content.Context;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.dw20;

/* compiled from: FriendsCleanupConfirmationDialog.kt */
/* loaded from: classes15.dex */
public final class qms extends dw20.b {
    public final String e;
    public b f;
    public b g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsCleanupConfirmationDialog.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Negative;
        public static final a Positive;

        static {
            a aVar = new a("Positive", 0);
            Positive = aVar;
            a aVar2 = new a("Negative", 1);
            Negative = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: FriendsCleanupConfirmationDialog.kt */
    public static final class b {
        public final String a;
        public final gzs<s3q0> b;

        public b(String str, gzs<s3q0> gzsVar) {
            this.a = str;
            this.b = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonData(title=");
            sb.append(this.a);
            sb.append(", onClick=");
            return uf3.d(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsCleanupConfirmationDialog.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Positive.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Negative.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qms(Context context, String str) {
        super(context, null);
        this.e = str;
    }

    public final void S0() {
        a.C0785a c0785a = new a.C0785a();
        ListBuilder e = e43.e();
        e.add(new xu20(this.e, null, 0, null, 14));
        b bVar = this.f;
        if (bVar != null) {
            e.add(new ModalActionSheetListItem(a.Positive.ordinal(), ModalActionSheetListItem.Appearance.Default, bVar.a, null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        }
        b bVar2 = this.g;
        if (bVar2 != null) {
            e.add(new ModalActionSheetListItem(a.Negative.ordinal(), ModalActionSheetListItem.Appearance.Negative, bVar2.a, null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        }
        c0785a.b = e.g();
        c0785a.c = new j6e(this, 28);
        c0785a.a(this.c, null);
    }
}
