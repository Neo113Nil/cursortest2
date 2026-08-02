package com.yandex.go.agreement.photoupload.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.z4b0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/agreement/photoupload/experiments/PhotoUploadEulaExperiment;", "Ln96;", "Lc6z;", "Companion", "Buttons", "com/yandex/go/agreement/photoupload/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PhotoUploadEulaExperiment extends n96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(15))};
    public static final PhotoUploadEulaExperiment h = new PhotoUploadEulaExperiment(0);
    public final boolean b;
    public final String c;
    public final FormattedText d;
    public final Buttons e;
    public final Map f;

    public /* synthetic */ PhotoUploadEulaExperiment(int i, boolean z, String str, FormattedText formattedText, Buttons buttons, Map map) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = buttons;
        }
        if ((i & 16) == 0) {
            this.f = kotlin.collections.b.f();
        } else {
            this.f = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.f;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/agreement/photoupload/experiments/PhotoUploadEulaExperiment$Buttons;", "", "Companion", "$serializer", "com/yandex/go/agreement/photoupload/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Buttons {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public /* synthetic */ Buttons(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public Buttons() {
            this.a = "";
            this.b = "";
        }
    }

    public PhotoUploadEulaExperiment() {
        this(0);
    }

    public PhotoUploadEulaExperiment(int i) {
        FormattedText formattedText = FormattedText.c;
        this.b = false;
        this.c = "";
        this.d = formattedText;
        this.e = null;
        this.f = kotlin.collections.b.f();
    }
}
