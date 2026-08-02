package xsna;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Pair;
import xsna.vmo0;

/* compiled from: TextToSpeechPlayerImpl.kt */
/* loaded from: classes6.dex */
public final class wmo0 implements vmo0 {
    public final Context a;
    public final bpn0 b = new bpn0(new mll0(this, 7));

    /* compiled from: TextToSpeechPlayerImpl.kt */
    public static final class a extends UtteranceProgressListener {
        public final WeakReference<vmo0.a> a;
        public final WeakReference<TextToSpeech> b;

        public a(wb20 wb20Var, TextToSpeech textToSpeech) {
            this.a = new WeakReference<>(wb20Var);
            this.b = new WeakReference<>(textToSpeech);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onDone(String str) {
            vmo0.a aVar = this.a.get();
            if (aVar != null) {
                aVar.b();
            }
            TextToSpeech textToSpeech = this.b.get();
            if (textToSpeech != null) {
                textToSpeech.setOnUtteranceProgressListener(null);
            }
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onError(String str) {
            this.a.get();
            TextToSpeech textToSpeech = this.b.get();
            if (textToSpeech != null) {
                textToSpeech.setOnUtteranceProgressListener(null);
            }
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onStart(String str) {
            vmo0.a aVar = this.a.get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public wmo0(Context context) {
        this.a = context;
    }

    @Override // xsna.vmo0
    public final void a(String str, Locale locale, wb20 wb20Var) {
        TextToSpeech textToSpeech = (TextToSpeech) this.b.getValue();
        if (textToSpeech.isLanguageAvailable(locale) != 0) {
            return;
        }
        textToSpeech.setLanguage(locale);
        textToSpeech.setOnUtteranceProgressListener(new a(wb20Var, textToSpeech));
        Iterator it = erm0.u0(TextToSpeech.getMaxSpeechInputLength(), str).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            textToSpeech.speak((String) next, i == 0 ? 0 : 1, yfb.b(new Pair("utteranceId", "message.translate.speech.id")), "message.translate.speech.id");
            i = i2;
        }
    }

    @Override // xsna.vmo0
    public final void b() {
        asu0.a.getClass();
        asu0.p().c(new n52(this, 15));
    }

    @Override // xsna.vmo0
    public final void c() {
        bpn0 bpn0Var = this.b;
        if (bpn0Var.isInitialized()) {
            ((TextToSpeech) bpn0Var.getValue()).stop();
        }
    }

    @Override // xsna.vmo0
    public final void d() {
        bpn0 bpn0Var = this.b;
        if (bpn0Var.isInitialized()) {
            c();
            ((TextToSpeech) bpn0Var.getValue()).shutdown();
        }
    }
}
