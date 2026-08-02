package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jxi;
import defpackage.jxv;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\u0019J+\u0010&\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b&\u0010'J#\u0010&\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010(JA\u0010&\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b&\u0010.J9\u0010&\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010/J)\u00101\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b1\u00102J!\u00101\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\"2\u0006\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u00103J?\u00101\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u00100\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0017¢\u0006\u0004\b1\u00104J7\u00101\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u0010\u0019J\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u001eJ\u001f\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020)H\u0016¢\u0006\u0004\b@\u0010=J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020)H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020)H\u0016¢\u0006\u0004\bD\u0010=J\u0019\u0010G\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020\u00062\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bI\u0010HJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020EH\u0017¢\u0006\u0004\bK\u0010HJ\u001f\u0010O\u001a\u00020\f2\u0006\u0010L\u001a\u00020\"2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bO\u0010PJ\u001f\u0010O\u001a\u00020\f2\u0006\u0010L\u001a\u00020\n2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bO\u0010QJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010L\u001a\u00020\"H\u0016¢\u0006\u0004\bO\u0010RJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\u000eJ7\u0010O\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bO\u0010SJ/\u0010O\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\bO\u0010TJ/\u0010O\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010UJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010L\u001a\u00020\"H\u0017¢\u0006\u0004\bV\u0010RJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010L\u001a\u00020\nH\u0017¢\u0006\u0004\bV\u0010\u000eJ/\u0010V\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0017¢\u0006\u0004\bV\u0010TJ/\u0010V\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017H\u0017¢\u0006\u0004\bV\u0010UJ\u001f\u0010Y\u001a\u00020\f2\u0006\u0010X\u001a\u00020W2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010[J\u0017\u0010\\\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0017¢\u0006\u0004\b\\\u0010[J\u0011\u0010^\u001a\u0004\u0018\u00010]H\u0016¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010]H\u0016¢\u0006\u0004\ba\u0010bJ\u001f\u0010e\u001a\u00020\f2\u0006\u0010L\u001a\u00020\"2\u0006\u0010d\u001a\u00020cH\u0017¢\u0006\u0004\be\u0010fJ\u0017\u0010e\u001a\u00020\f2\u0006\u0010L\u001a\u00020\"H\u0017¢\u0006\u0004\be\u0010RJ\u001f\u0010e\u001a\u00020\f2\u0006\u0010X\u001a\u00020W2\u0006\u0010d\u001a\u00020cH\u0017¢\u0006\u0004\be\u0010gJ\u0017\u0010e\u001a\u00020\f2\u0006\u0010X\u001a\u00020WH\u0017¢\u0006\u0004\be\u0010[J7\u0010e\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010d\u001a\u00020cH\u0017¢\u0006\u0004\be\u0010hJ/\u0010e\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)H\u0017¢\u0006\u0004\be\u0010TJ\u0017\u0010k\u001a\u00020\u00062\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010k\u001a\u00020\u00062\u0006\u0010j\u001a\u00020i2\u0006\u0010m\u001a\u00020\"H\u0016¢\u0006\u0004\bk\u0010nJ\u001f\u0010k\u001a\u00020\u00062\u0006\u0010j\u001a\u00020i2\u0006\u0010m\u001a\u00020\nH\u0016¢\u0006\u0004\bk\u0010oJ7\u0010t\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\"2\u0006\u0010q\u001a\u00020)2\u0006\u0010r\u001a\u00020)2\u0006\u0010s\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bt\u0010uJO\u0010t\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010q\u001a\u00020)2\u0006\u0010r\u001a\u00020)2\u0006\u0010s\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\bt\u0010vJ/\u0010{\u001a\u00020\u00062\u0006\u0010w\u001a\u00020\u00172\u0006\u0010x\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u0017H\u0016¢\u0006\u0004\b{\u0010|J1\u0010}\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b}\u0010~J4\u0010}\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u007f\u001a\u0004\u0018\u00010\n2\u0006\u0010m\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0005\b}\u0010\u0080\u0001J4\u0010}\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u007f\u001a\u0004\u0018\u00010\n2\u0006\u0010m\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0005\b}\u0010\u0081\u0001Jc\u0010}\u001a\u00020\u00062\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0007\u0010\u0088\u0001\u001a\u00020\u00172\u0007\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0005\b}\u0010\u008b\u0001Jc\u0010}\u001a\u00020\u00062\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020\u00172\u0007\u0010\u0087\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u00020\u00172\u0007\u0010\u0089\u0001\u001a\u00020\u00172\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0005\b}\u0010\u008c\u0001J*\u0010}\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020E2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0005\b}\u0010\u008d\u0001J^\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0007\u0010\u008e\u0001\u001a\u00020\u00172\u0007\u0010\u008f\u0001\u001a\u00020\u00172\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00172\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J5\u0010\u0099\u0001\u001a\u00020\u00062\u0007\u0010\u0096\u0001\u001a\u00020)2\u0007\u0010\u0097\u0001\u001a\u00020)2\u0007\u0010\u0098\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u009c\u0001\u0010\u001eJ\u001c\u0010\u009c\u0001\u001a\u00020\u00062\b\u0010\u009b\u0001\u001a\u00030\u009d\u0001H\u0017¢\u0006\u0006\b\u009c\u0001\u0010\u009e\u0001J%\u0010\u009c\u0001\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020\u00172\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010¡\u0001J%\u0010\u009c\u0001\u001a\u00020\u00062\u0007\u0010\u009b\u0001\u001a\u00020\u00172\b\u0010 \u0001\u001a\u00030¢\u0001H\u0017¢\u0006\u0006\b\u009c\u0001\u0010£\u0001J&\u0010\u009c\u0001\u001a\u00020\u00062\b\u0010\u009b\u0001\u001a\u00030\u009d\u00012\b\u0010 \u0001\u001a\u00030¢\u0001H\u0017¢\u0006\u0006\b\u009c\u0001\u0010¤\u0001J>\u0010©\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020)2\u0007\u0010¦\u0001\u001a\u00020)2\u0007\u0010§\u0001\u001a\u00020)2\u0007\u0010¨\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J6\u0010\u00ad\u0001\u001a\u00020\u00062\b\u0010«\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J$\u0010\u00ad\u0001\u001a\u00020\u00062\b\u0010«\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010¯\u0001J\"\u0010°\u0001\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J:\u0010°\u0001\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b°\u0001\u0010ª\u0001J\u001a\u0010²\u0001\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J.\u0010¶\u0001\u001a\u00020\u00062\b\u0010µ\u0001\u001a\u00030´\u00012\u0006\u0010m\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0006\b¶\u0001\u0010·\u0001J.\u0010¶\u0001\u001a\u00020\u00062\b\u0010µ\u0001\u001a\u00030´\u00012\u0006\u0010m\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0006\b¶\u0001\u0010¸\u0001J\"\u0010¹\u0001\u001a\u00020\u00062\u0006\u0010X\u001a\u00020W2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J,\u0010»\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J8\u0010½\u0001\u001a\u00020\u00062\n\u0010«\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b½\u0001\u0010®\u0001J$\u0010½\u0001\u001a\u00020\u00062\b\u0010«\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b½\u0001\u0010¯\u0001J@\u0010Â\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010À\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\b\u0010Á\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J.\u0010Â\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030Ä\u00012\b\u0010Á\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bÂ\u0001\u0010Å\u0001J\"\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bÆ\u0001\u0010±\u0001J\"\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J:\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bÆ\u0001\u0010ª\u0001J*\u0010È\u0001\u001a\u00020\u00062\u0006\u0010x\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u00172\u0006\u0010z\u001a\u00020\u0017H\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J4\u0010Ì\u0001\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\"2\u0007\u0010Ê\u0001\u001a\u00020)2\u0007\u0010Ë\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bÌ\u0001\u0010Í\u0001JL\u0010Ì\u0001\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0007\u0010Ê\u0001\u001a\u00020)2\u0007\u0010Ë\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bÌ\u0001\u0010Î\u0001JP\u0010Õ\u0001\u001a\u00020\u00062\u0007\u0010Ï\u0001\u001a\u00020\"2\u0007\u0010Ð\u0001\u001a\u00020)2\u0007\u0010Ñ\u0001\u001a\u00020)2\u0007\u0010Ò\u0001\u001a\u00020\"2\u0007\u0010Ó\u0001\u001a\u00020)2\u0007\u0010Ô\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J@\u0010Õ\u0001\u001a\u00020\u00062\u0007\u0010Ï\u0001\u001a\u00020\"2\b\u0010×\u0001\u001a\u00030\u0090\u00012\u0007\u0010Ò\u0001\u001a\u00020\"2\b\u0010Ø\u0001\u001a\u00030\u0090\u00012\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bÕ\u0001\u0010Ù\u0001JS\u0010á\u0001\u001a\u00020\u00062\b\u0010Ú\u0001\u001a\u00030\u0082\u00012\u0007\u0010Û\u0001\u001a\u00020\u00172\b\u0010Ü\u0001\u001a\u00030\u0090\u00012\u0007\u0010Ý\u0001\u001a\u00020\u00172\u0007\u0010Þ\u0001\u001a\u00020\u00172\b\u0010à\u0001\u001a\u00030ß\u00012\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bá\u0001\u0010â\u0001JH\u0010ã\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010À\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J6\u0010ã\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030Ä\u00012\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bã\u0001\u0010å\u0001JH\u0010ã\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030Ä\u00012\u0007\u0010æ\u0001\u001a\u00020\u00172\u0007\u0010ç\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bã\u0001\u0010è\u0001JH\u0010ã\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030é\u00012\u0007\u0010æ\u0001\u001a\u00020\u00172\u0007\u0010ç\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bã\u0001\u0010ê\u0001JP\u0010í\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010À\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\u0006\u0010X\u001a\u00020W2\u0007\u0010ë\u0001\u001a\u00020)2\u0007\u0010ì\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J>\u0010í\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030Ä\u00012\u0006\u0010X\u001a\u00020W2\u0007\u0010ë\u0001\u001a\u00020)2\u0007\u0010ì\u0001\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\bí\u0001\u0010ï\u0001Jc\u0010ó\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010À\u0001\u001a\u00020\u00172\u0007\u0010¬\u0001\u001a\u00020\u00172\u0007\u0010ð\u0001\u001a\u00020\u00172\u0007\u0010ñ\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0007\u0010ò\u0001\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bó\u0001\u0010ô\u0001Jc\u0010ó\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030é\u00012\u0007\u0010æ\u0001\u001a\u00020\u00172\u0007\u0010ç\u0001\u001a\u00020\u00172\u0007\u0010õ\u0001\u001a\u00020\u00172\u0007\u0010ö\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0007\u0010ò\u0001\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bó\u0001\u0010÷\u0001Jc\u0010ó\u0001\u001a\u00020\u00062\b\u0010¿\u0001\u001a\u00030ø\u00012\u0007\u0010æ\u0001\u001a\u00020\u00172\u0007\u0010ç\u0001\u001a\u00020\u00172\u0007\u0010õ\u0001\u001a\u00020\u00172\u0007\u0010ö\u0001\u001a\u00020\u00172\u0007\u0010\u0086\u0001\u001a\u00020)2\u0007\u0010\u0087\u0001\u001a\u00020)2\u0007\u0010ò\u0001\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0006\bó\u0001\u0010ù\u0001J\u0088\u0001\u0010\u0082\u0002\u001a\u00020\u00062\b\u0010 \u0001\u001a\u00030ú\u00012\u0007\u0010û\u0001\u001a\u00020\u00172\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00172\n\u0010ü\u0001\u001a\u0005\u0018\u00010\u0090\u00012\u0007\u0010ý\u0001\u001a\u00020\u00172\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00172\n\u0010ÿ\u0001\u001a\u0005\u0018\u00010þ\u00012\u0007\u0010\u0080\u0002\u001a\u00020\u00172\u0007\u0010\u0081\u0002\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\u001c\u0010\u0086\u0002\u001a\u00020\u00062\b\u0010\u0085\u0002\u001a\u00030\u0084\u0002H\u0017¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002R2\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u0012\u0005\b\u008e\u0002\u0010\u0003\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0017\u0010\u0090\u0002\u001a\u00020\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u008b\u0002¨\u0006\u0091\u0002"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "<init>", "()V", "canvas", "Lkotlin/Function1;", "Lzy11;", "block", "withCanvas", "(Landroid/graphics/Canvas;Ltls;)V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", CaretView.ALPHA_PROPERTY, "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "a", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", RemoteBioParameters.X, RemoteBioParameters.Y, "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "_nativeCanvas", "Landroid/graphics/Canvas;", "get_nativeCanvas$ui_text", "()Landroid/graphics/Canvas;", "set_nativeCanvas$ui_text", "(Landroid/graphics/Canvas;)V", "get_nativeCanvas$ui_text$annotations", "getNativeCanvas", "nativeCanvas", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas _nativeCanvas;

    private final Canvas getNativeCanvas() {
        Canvas canvas = this._nativeCanvas;
        if (canvas != null) {
            return canvas;
        }
        jxv.d("Text drawing wrapper is missing a Canvas!");
        ny61.A();
        return null;
    }

    public static /* synthetic */ void get_nativeCanvas$ui_text$annotations() {
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        return getNativeCanvas().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        return getNativeCanvas().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean clipPath(Path path, Region.Op op) {
        return getNativeCanvas().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean clipRect(RectF rect, Region.Op op) {
        return getNativeCanvas().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        getNativeCanvas().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        getNativeCanvas().disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a, int r, int g, int b) {
        getNativeCanvas().drawARGB(a, r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        getNativeCanvas().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, left, top, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        getNativeCanvas().drawBitmapMesh(bitmap, meshWidth, meshHeight, verts, vertOffset, colors, colorOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        getNativeCanvas().drawCircle(cx, cy, radius, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        getNativeCanvas().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        getNativeCanvas().drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        getNativeCanvas().drawGlyphs(glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        getNativeCanvas().drawLine(startX, startY, stopX, stopY, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        getNativeCanvas().drawLines(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        getNativeCanvas().drawOval(oval, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        getNativeCanvas().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        getNativeCanvas().drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        getNativeCanvas().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        getNativeCanvas().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x, float y, Paint paint) {
        getNativeCanvas().drawPoint(x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        getNativeCanvas().drawPoints(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    @jxi
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        getNativeCanvas().drawPosText(text, index, count, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r, int g, int b) {
        getNativeCanvas().drawRGB(r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        getNativeCanvas().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        getNativeCanvas().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) {
        getNativeCanvas().drawRoundRect(rect, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int index, int count, float x, float y, Paint paint) {
        getNativeCanvas().drawText(text, index, count, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) {
        getNativeCanvas().drawTextOnPath(text, index, count, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, Paint paint) {
        getNativeCanvas().drawTextRun(text, index, count, contextIndex, contextCount, x, y, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) {
        getNativeCanvas().drawVertices(mode, vertexCount, verts, vertOffset, texs, texOffset, colors, colorOffset, indices, indexOffset, indexCount, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        getNativeCanvas().enableZ();
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        boolean clipBounds = getNativeCanvas().getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return getNativeCanvas().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return getNativeCanvas().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return getNativeCanvas().getHeight();
    }

    @Override // android.graphics.Canvas
    @jxi
    public void getMatrix(Matrix ctm) {
        getNativeCanvas().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return getNativeCanvas().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return getNativeCanvas().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return getNativeCanvas().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return getNativeCanvas().getWidth();
    }

    /* renamed from: get_nativeCanvas$ui_text, reason: from getter */
    public final Canvas get_nativeCanvas() {
        return this._nativeCanvas;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return getNativeCanvas().isOpaque();
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        return getNativeCanvas().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        getNativeCanvas().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        getNativeCanvas().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        getNativeCanvas().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return getNativeCanvas().save();
    }

    @Override // android.graphics.Canvas
    @jxi
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        return getNativeCanvas().saveLayer(bounds, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @jxi
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return getNativeCanvas().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        getNativeCanvas().scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        getNativeCanvas().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        getNativeCanvas().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        getNativeCanvas().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        getNativeCanvas().setMatrix(matrix);
    }

    public final void set_nativeCanvas$ui_text(Canvas canvas) {
        this._nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        getNativeCanvas().skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        getNativeCanvas().translate(dx, dy);
    }

    public final void withCanvas(Canvas canvas, tls block) {
        set_nativeCanvas$ui_text(canvas);
        try {
            block.invoke(this);
        } finally {
            set_nativeCanvas$ui_text(null);
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        getNativeCanvas().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        getNativeCanvas().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        getNativeCanvas().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        getNativeCanvas().drawLines(pts, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        getNativeCanvas().drawOval(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        getNativeCanvas().drawPatch(patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        getNativeCanvas().drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        getNativeCanvas().drawPoints(pts, paint);
    }

    @Override // android.graphics.Canvas
    @jxi
    public void drawPosText(String text, float[] pos, Paint paint) {
        getNativeCanvas().drawPosText(text, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r, Paint paint) {
        getNativeCanvas().drawRect(r, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint) {
        getNativeCanvas().drawRoundRect(left, top, right, bottom, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float x, float y, Paint paint) {
        getNativeCanvas().drawText(text, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        getNativeCanvas().drawTextOnPath(text, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        getNativeCanvas().drawTextRun(text, start, end, contextStart, contextEnd, x, y, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        return getNativeCanvas().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        return getNativeCanvas().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean clipRect(Rect rect, Region.Op op) {
        return getNativeCanvas().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        getNativeCanvas().drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        getNativeCanvas().drawRect(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int start, int end, float x, float y, Paint paint) {
        getNativeCanvas().drawText(text, start, end, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        boolean quickReject;
        quickReject = getNativeCanvas().quickReject(rect);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        return getNativeCanvas().saveLayer(bounds, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return getNativeCanvas().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        return getNativeCanvas().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @jxi
    public void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint) {
        getNativeCanvas().drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, PorterDuff.Mode mode) {
        getNativeCanvas().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) {
        getNativeCanvas().drawText(text, start, end, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        getNativeCanvas().drawTextRun(text, start, end, contextStart, contextEnd, x, y, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    @jxi
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        return getNativeCanvas().saveLayer(left, top, right, bottom, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @jxi
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return getNativeCanvas().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        return getNativeCanvas().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        return getNativeCanvas().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @jxi
    public void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint) {
        getNativeCanvas().drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, BlendMode mode) {
        getNativeCanvas().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        return getNativeCanvas().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        return getNativeCanvas().saveLayer(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return getNativeCanvas().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        return getNativeCanvas().clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        getNativeCanvas().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        boolean quickReject;
        quickReject = getNativeCanvas().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        return getNativeCanvas().clipOutRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return getNativeCanvas().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, BlendMode mode) {
        getNativeCanvas().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return getNativeCanvas().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    @jxi
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        return getNativeCanvas().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        boolean quickReject;
        quickReject = getNativeCanvas().quickReject(left, top, right, bottom);
        return quickReject;
    }
}
