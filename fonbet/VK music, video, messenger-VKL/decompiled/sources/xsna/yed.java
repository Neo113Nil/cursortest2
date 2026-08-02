package xsna;

import com.vk.dto.stories.model.clickable.ClickableVkTicket;
import com.vk.dto.stories.model.clickable.SeanceInfo;

/* compiled from: VideoFileAdapter.kt */
/* loaded from: classes17.dex */
public final class yed implements oih0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final a e;

    /* compiled from: VideoFileAdapter.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(SeanceInfo seanceInfo) {
            this.a = seanceInfo != null ? seanceInfo.b : null;
            this.b = seanceInfo != null ? seanceInfo.c : null;
            this.c = seanceInfo != null ? seanceInfo.d : null;
            this.d = seanceInfo != null ? seanceInfo.e : null;
        }
    }

    public yed(ClickableVkTicket clickableVkTicket, SeanceInfo seanceInfo) {
        this.a = clickableVkTicket.e;
        this.b = clickableVkTicket.f;
        this.c = clickableVkTicket.g;
        this.d = clickableVkTicket.h;
        this.e = new a(seanceInfo);
    }

    @Override // xsna.oih0
    public final String a() {
        return this.a;
    }

    @Override // xsna.oih0
    public final a b() {
        return this.e;
    }

    @Override // xsna.oih0
    public final String getImage() {
        return this.c;
    }

    @Override // xsna.oih0
    public final String getTitle() {
        return this.b;
    }

    @Override // xsna.oih0
    public final String getUrl() {
        return this.d;
    }
}
