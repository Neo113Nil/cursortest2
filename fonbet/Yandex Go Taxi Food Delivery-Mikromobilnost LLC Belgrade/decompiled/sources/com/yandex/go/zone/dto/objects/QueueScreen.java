package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/QueueScreen;", "", "Companion", "QueueButton", "com/yandex/go/zone/dto/objects/l3", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class QueueScreen {
    public static final l3 Companion = new l3();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(0)), null, null};
    public static final QueueScreen g = new QueueScreen(0);
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final FormattedText d;
    public final String e;

    public /* synthetic */ QueueScreen(int i, FormattedText formattedText, FormattedText formattedText2, List list, FormattedText formattedText3, String str) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueScreen)) {
            return false;
        }
        QueueScreen queueScreen = (QueueScreen) obj;
        return jl40.l(this.a, queueScreen.a) && jl40.l(this.b, queueScreen.b) && jl40.l(this.c, queueScreen.c) && jl40.l(this.d, queueScreen.d) && jl40.l(this.e, queueScreen.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.c(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d.a);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("QueueScreen(title=", this.a, ", subtitle=", this.b, ", buttons=");
        r.append(this.c);
        r.append(", hint=");
        r.append(this.d);
        r.append(", imageTag=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }

    public QueueScreen() {
        this(0);
    }

    public QueueScreen(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = EmptyList.a;
        this.d = formattedText;
        this.e = "";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/QueueScreen$QueueButton;", "", "Companion", "QueueButtonAction", "$serializer", "com/yandex/go/zone/dto/objects/m3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class QueueButton {
        public static final m3 Companion = new m3();
        public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(1)), null, null, null, null, null};
        public final QueueButtonAction a;
        public final FormattedText b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final double f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/QueueScreen$QueueButton$QueueButtonAction;", "", "Companion", "com/yandex/go/zone/dto/objects/n3", "PRIMARY", "SECONDARY", JCP.RAW_PREFIX, "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class QueueButtonAction {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ QueueButtonAction[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final n3 Companion;
            public static final QueueButtonAction NONE;
            public static final QueueButtonAction PRIMARY;
            public static final QueueButtonAction SECONDARY;

            static {
                QueueButtonAction queueButtonAction = new QueueButtonAction("PRIMARY", 0);
                PRIMARY = queueButtonAction;
                QueueButtonAction queueButtonAction2 = new QueueButtonAction("SECONDARY", 1);
                SECONDARY = queueButtonAction2;
                QueueButtonAction queueButtonAction3 = new QueueButtonAction(JCP.RAW_PREFIX, 2);
                NONE = queueButtonAction3;
                QueueButtonAction[] queueButtonActionArr = {queueButtonAction, queueButtonAction2, queueButtonAction3};
                $VALUES = queueButtonActionArr;
                $ENTRIES = kotlin.enums.a.a(queueButtonActionArr);
                Companion = new n3();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hkg0(2));
            }

            public static QueueButtonAction valueOf(String str) {
                return (QueueButtonAction) Enum.valueOf(QueueButtonAction.class, str);
            }

            public static QueueButtonAction[] values() {
                return (QueueButtonAction[]) $VALUES.clone();
            }
        }

        public /* synthetic */ QueueButton(int i, QueueButtonAction queueButtonAction, FormattedText formattedText, String str, boolean z, boolean z2, double d) {
            this.a = (i & 1) == 0 ? QueueButtonAction.NONE : queueButtonAction;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 16) == 0) {
                this.e = true;
            } else {
                this.e = z2;
            }
            if ((i & 32) == 0) {
                this.f = 1.0d;
            } else {
                this.f = d;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueueButton)) {
                return false;
            }
            QueueButton queueButton = (QueueButton) obj;
            return this.a == queueButton.a && jl40.l(this.b, queueButton.b) && jl40.l(this.c, queueButton.c) && this.d == queueButton.d && this.e == queueButton.e && Double.compare(this.f, queueButton.f) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f) + unr0.e(unr0.e(unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QueueButton(action=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", backgroundColor=");
            tse0.y(this.c, ", isLoading=", ", isActive=", sb, this.d);
            sb.append(this.e);
            sb.append(", transparency=");
            sb.append(this.f);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public QueueButton() {
            QueueButtonAction queueButtonAction = QueueButtonAction.NONE;
            FormattedText formattedText = FormattedText.c;
            this.a = queueButtonAction;
            this.b = formattedText;
            this.c = "";
            this.d = false;
            this.e = true;
            this.f = 1.0d;
        }
    }
}
