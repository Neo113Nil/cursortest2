package xsna;

import android.content.Context;
import android.graphics.Path;
import android.text.TextPaint;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.entrypoints.stub.ClipsEntryPointsComponentStub;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.im.chat.onlines.impl.di.ChatOnlineMembersFeatureComponentImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.StoriesFeatures;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.random.Random;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.ds60;
import xsna.smt;
import xsna.uvd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ee4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Integer b;
        boolean z = false;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 1:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                return new nbk();
            case 2:
                qcy<Object>[] qcyVarArr2 = ChatOnlineMembersFeatureComponentImpl.b;
                qni0 qni0Var = qni0.a;
                return new aub(new u04(1), new dz5(), new k7b0());
            case 3:
                TextPaint textPaint = new TextPaint();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                com.vk.typography.b.j(textPaint, context, null, Float.valueOf(13.0f), 10);
                textPaint.setLetterSpacing(0.015f);
                return textPaint;
            case 4:
                return s3q0.a;
            case 5:
                return new uvd.b();
            case 6:
                qcy<Object>[] qcyVarArr3 = ClipsEntryPointsComponentStub.c;
                return new r1e();
            case 7:
                qcy<Object>[] qcyVarArr4 = ClipsInternalNpsComponentImpl.g;
                return new tjx();
            case 8:
                return Calendar.getInstance();
            case 9:
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"DialogThemeLoader", "Default theme was loaded success"});
                }
                return s3q0.a;
            case 10:
                return new Integer[]{100, 200, 250, 300, 400, 425, 450, 500, 550, 600, 650, Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED), 800, 1000, 2000, 5000, 20000};
            case 11:
                ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 12:
                return new i1t0(true, bo.h());
            case 13:
                byte[] bArr = u7r.j;
                return "Max file size has been reached";
            case 14:
                return new q73(new ykg());
            case 15:
                return e43.l(smt.a.C3680a.b, new lmt(ds60.a.C2747a.b), new lmt(ds60.a.b.b));
            case 16:
                return new ne6();
            case 17:
                Path path = new Path();
                path.moveTo(26.1238f, 36.8518f);
                path.cubicTo(28.3838f, 36.8518f, 30.0067f, 36.8508f, 31.2805f, 36.7467f);
                path.cubicTo(32.5403f, 36.6438f, 33.3527f, 36.446f, 34.011f, 36.1106f);
                path.cubicTo(35.2905f, 35.4587f, 36.3307f, 34.4184f, 36.9827f, 33.1389f);
                path.cubicTo(37.3181f, 32.4806f, 37.5159f, 31.6682f, 37.6188f, 30.4084f);
                path.cubicTo(37.7229f, 29.1346f, 37.7238f, 27.5118f, 37.7238f, 25.2518f);
                path.lineTo(37.7238f, 14.8518f);
                path.cubicTo(37.7238f, 12.5917f, 37.7229f, 10.9689f, 37.6188f, 9.69509f);
                path.cubicTo(37.5159f, 8.43528f, 37.3181f, 7.62291f, 36.9827f, 6.96462f);
                path.cubicTo(36.3307f, 5.68512f, 35.2905f, 4.64485f, 34.011f, 3.99291f);
                path.cubicTo(33.3527f, 3.6575f, 32.5403f, 3.4597f, 31.2805f, 3.35677f);
                path.cubicTo(30.0067f, 3.25269f, 28.3838f, 3.25176f, 26.1238f, 3.25176f);
                path.lineTo(15.7238f, 3.25176f);
                path.cubicTo(13.4638f, 3.25176f, 11.841f, 3.25269f, 10.5672f, 3.35677f);
                path.cubicTo(9.30735f, 3.4597f, 8.49498f, 3.6575f, 7.83669f, 3.99291f);
                path.cubicTo(6.55719f, 4.64485f, 5.51692f, 5.68512f, 4.86498f, 6.96462f);
                path.cubicTo(4.52957f, 7.62291f, 4.33177f, 8.43528f, 4.22884f, 9.69509f);
                path.cubicTo(4.12476f, 10.9689f, 4.12383f, 12.5917f, 4.12383f, 14.8518f);
                path.lineTo(4.12383f, 25.2518f);
                path.cubicTo(4.12383f, 27.5118f, 4.12476f, 29.1346f, 4.22884f, 30.4084f);
                path.cubicTo(4.33177f, 31.6682f, 4.52957f, 32.4806f, 4.86498f, 33.1389f);
                path.cubicTo(5.51692f, 34.4184f, 6.55719f, 35.4587f, 7.83669f, 36.1106f);
                path.cubicTo(8.49498f, 36.446f, 9.30735f, 36.6438f, 10.5672f, 36.7467f);
                path.cubicTo(11.841f, 36.8508f, 13.4638f, 36.8518f, 15.7238f, 36.8518f);
                path.lineTo(26.1238f, 36.8518f);
                path.close();
                return path;
            case 18:
                return "#submitStopEnvironment";
            case 19:
                return new Regex("(ads|marusia|music|ord|expert|live|bid|id|dev|adblogger)\\.(vk|vkontakte|vkvideo)\\.(com|ru|me)");
            case 20:
                return Pattern.compile("(#\\w{2,})", RegexOption.IGNORE_CASE.getValue() | RegexOption.UNIX_LINES.getValue());
            case 21:
                return new s290();
            case 22:
                return new float[9];
            case 23:
                return s3q0.a;
            case 24:
                Random.b.getClass();
                if (Random.c.i() >= 0.01f) {
                    return null;
                }
                asu0.a.getClass();
                return new com.vk.stat.recycler.d((List<? extends jjf0>) Collections.singletonList(new com.vk.stat.recycler.c(asu0.o(), "im_chat_history")));
            case 25:
                return Float.valueOf(iah0.b(14.0f));
            case 26:
                return new p2r();
            case 27:
                return s3q0.a;
            case 28:
                return Calendar.getInstance();
            default:
                b.d i = com.vk.toggle.b.A.i(StoriesFeatures.ST_PHONE_BOOK_STORIES);
                if (i != null && (b = i.b()) != null && b.intValue() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
