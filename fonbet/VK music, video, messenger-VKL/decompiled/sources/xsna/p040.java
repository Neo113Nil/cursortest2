package xsna;

import android.text.Editable;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.ui.views.RichEditText;

/* compiled from: MsgTextFormatFeature.kt */
/* loaded from: classes11.dex */
public interface p040 {
    void a(RichEditText richEditText);

    MsgTextFormat b(Editable editable);

    /* compiled from: MsgTextFormatFeature.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final p040 STUB = new C3480a();

        public final p040 getSTUB() {
            return STUB;
        }

        /* compiled from: MsgTextFormatFeature.kt */
        /* renamed from: xsna.p040$a$a, reason: collision with other inner class name */
        public static final class C3480a implements p040 {
            @Override // xsna.p040
            public final MsgTextFormat b(Editable editable) {
                MsgTextFormat msgTextFormat = MsgTextFormat.d;
                return MsgTextFormat.d;
            }

            @Override // xsna.p040
            public final void a(RichEditText richEditText) {
            }
        }
    }
}
