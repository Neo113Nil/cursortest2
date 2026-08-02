package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/Button;", "", "text", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Alignment", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Button {
    private final String action;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/Button$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Alignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment VERTICAL = new Alignment("VERTICAL", 0);
        public static final Alignment HORIZONTAL = new Alignment("HORIZONTAL", 1);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{VERTICAL, HORIZONTAL};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Alignment(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public Button(@Json(name = "text") String str, @Json(name = "action") String str2) {
        this.text = str;
        this.action = str2;
    }

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = button.text;
        }
        if ((i & 2) != 0) {
            str2 = button.action;
        }
        return button.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final Button copy(@Json(name = "text") String text, @Json(name = "action") String action) {
        return new Button(text, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return jl40.l(this.text, button.text) && jl40.l(this.action, button.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("Button(text=", this.text, ", action=", this.action, Extension.C_BRAKE);
    }
}
