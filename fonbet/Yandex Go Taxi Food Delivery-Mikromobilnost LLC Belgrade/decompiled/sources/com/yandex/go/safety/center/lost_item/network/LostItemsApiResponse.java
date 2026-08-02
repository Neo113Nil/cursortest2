package com.yandex.go.safety.center.lost_item.network;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.k4o;
import defpackage.o3z;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse;", "", "Companion", "Modal", "$serializer", "com/yandex/go/safety/center/lost_item/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LostItemsApiResponse {
    public static final a Companion = new a();
    public final Modal a;
    public final ief b;

    public /* synthetic */ LostItemsApiResponse(int i, Modal modal, ief iefVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, LostItemsApiResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = modal;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iefVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal;", "", "Companion", "Header", "Bullet", PlusPayUiKitInflaterFactory.NAME_BUTTON, "$serializer", "com/yandex/go/safety/center/lost_item/network/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Modal {
        public static final j Companion = new j();
        public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(19)), null};
        public final Header a;
        public final FormattedText b;
        public final FormattedText c;
        public final List d;
        public final Button e;

        public /* synthetic */ Modal(int i, Header header, FormattedText formattedText, FormattedText formattedText2, List list, Button button) {
            if (22 != (i & 22)) {
                qje.Z(i, 22, LostItemsApiResponse$Modal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = header;
            }
            this.b = formattedText;
            this.c = formattedText2;
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            this.e = button;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal$Header;", "", "Companion", "Type", "$serializer", "com/yandex/go/safety/center/lost_item/network/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Header {
            public static final k Companion = new k();
            public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(22))};
            public final String a;
            public final Type b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal$Header$Type;", "", "Companion", "com/yandex/go/safety/center/lost_item/network/l", "UNKNOWN", "IMAGE", "ICON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class Type {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                private static final i3y $cachedSerializer$delegate;
                public static final l Companion;
                public static final Type ICON;
                public static final Type IMAGE;
                public static final Type UNKNOWN;

                static {
                    Type type = new Type("UNKNOWN", 0);
                    UNKNOWN = type;
                    Type type2 = new Type("IMAGE", 1);
                    IMAGE = type2;
                    Type type3 = new Type("ICON", 2);
                    ICON = type3;
                    Type[] typeArr = {type, type2, type3};
                    $VALUES = typeArr;
                    $ENTRIES = kotlin.enums.a.a(typeArr);
                    Companion = new l();
                    $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(23));
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Header(int i, String str, Type type) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, LostItemsApiResponse$Modal$Header$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = str;
                this.b = type;
            }

            public Header() {
                Type type = Type.UNKNOWN;
                this.a = "";
                this.b = type;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal$Bullet;", "", "Companion", "$serializer", "com/yandex/go/safety/center/lost_item/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Bullet {
            public static final b Companion = new b();
            public final String a;
            public final FormattedText b;
            public final FormattedText c;

            public /* synthetic */ Bullet(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                if (6 != (i & 6)) {
                    qje.Z(i, 6, LostItemsApiResponse$Modal$Bullet$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                this.b = formattedText;
                this.c = formattedText2;
            }

            public Bullet() {
                FormattedText formattedText = FormattedText.c;
                this.a = null;
                this.b = formattedText;
                this.c = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse$Modal$Button;", "", "Companion", "com/yandex/go/safety/center/lost_item/network/h", "$serializer", "com/yandex/go/safety/center/lost_item/network/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Button {
            public static final i Companion = new i();
            public final h a;
            public final String b;
            public final String c;

            public /* synthetic */ Button(int i, h hVar, String str, String str2) {
                if (3 != (i & 3)) {
                    qje.Z(i, 3, LostItemsApiResponse$Modal$Button$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = hVar;
                this.b = str;
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str2;
                }
            }

            public Button() {
                this(0);
            }

            public Button(int i) {
                this.a = g.INSTANCE;
                this.b = "";
                this.c = null;
            }
        }

        public Modal() {
            this(0);
        }

        public Modal(int i) {
            FormattedText formattedText = FormattedText.c;
            Button button = new Button(0);
            this.a = null;
            this.b = formattedText;
            this.c = formattedText;
            this.d = EmptyList.a;
            this.e = button;
        }
    }

    public LostItemsApiResponse() {
        this.a = new Modal(0);
        this.b = null;
    }
}
