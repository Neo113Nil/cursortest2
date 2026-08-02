package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.channels.impl.channel_screen.send_msg.a;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import one.video.calls.sdk_private.aP;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;
import xsna.zbb;

/* compiled from: ScrollerCompat.java */
@Deprecated
/* loaded from: classes12.dex */
public final class rhh0 implements io.reactivex.rxjava3.functions.l, e1y0, qo10, zws, kv20, xs1, c4, ttz0 {
    public Object b;

    public /* synthetic */ rhh0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.xs1
    public Collection L() {
        return ((xs1) this.b).L();
    }

    @Override // xsna.xs1
    public boolean P(twf twfVar) {
        return ((xs1) this.b).P((tqg) twfVar);
    }

    @Override // xsna.zws
    public cxs a(Activity activity, di0 di0Var, df0 df0Var) {
        Object obj;
        Iterator it = ((ArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((bxs) obj).b(di0Var)) {
                break;
            }
        }
        bxs bxsVar = (bxs) obj;
        if (bxsVar != null) {
            return bxsVar.a(activity, di0Var, df0Var);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) throws Throwable {
        ((ffg0) this.b).b++;
        io.reactivex.rxjava3.core.q.T(new Object());
        return io.reactivex.rxjava3.core.q.B0(5000, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.xs1
    public void b() {
        ((xs1) this.b).b();
    }

    @Override // xsna.kv20
    public void c(ModalAuthHostActivity modalAuthHostActivity) {
        ((fv20) this.b).Wn(modalAuthHostActivity.getSupportFragmentManager(), "modal_auth_fragment_tag");
    }

    @Override // xsna.c4
    public void d(b4 b4Var) {
        q4 q4Var = ((VideoMinimizableDiscoveryFragment) this.b).I0;
        if (q4Var != null) {
            q4Var.d(b4Var);
        }
    }

    @Override // xsna.e1y0
    public void e(Editable editable) {
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setBotKeyboardAllowed(false);
        if (editable.length() > 0 && aVar.u == a.b.NORMAL) {
            zbb.b bVar = aVar.E;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
        }
        zbb.b bVar2 = aVar.E;
        (bVar2 != null ? bVar2 : null).getClass();
    }

    @Override // xsna.qo10
    public int f(long j, long j2, long j3, er10 er10Var) {
        return 1;
    }

    @Override // xsna.kv20
    public void g() {
        fv20 fv20Var = (fv20) this.b;
        Bundle arguments = fv20Var.getArguments();
        if (arguments != null) {
            arguments.putBoolean("need_finish_activity", false);
        }
        fv20Var.hide();
    }

    @Override // xsna.qo10
    public g5i0 h() {
        return (g5i0) this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r10 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0072, code lost:
    
        if (r10 == 3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005d, code lost:
    
        if (r10 == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0178 A[LOOP:0: B:2:0x0009->B:31:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e A[Catch: aP -> 0x004e, bt -> 0x0052, bz -> 0x017e, TryCatch #2 {aP -> 0x004e, bt -> 0x0052, bz -> 0x017e, blocks: (B:5:0x000f, B:7:0x001c, B:9:0x0026, B:11:0x002c, B:13:0x0035, B:15:0x0048, B:17:0x00c5, B:19:0x00d1, B:21:0x00db, B:22:0x00ea, B:23:0x00fb, B:25:0x0101, B:27:0x0119, B:28:0x012d, B:36:0x00f2, B:37:0x0054, B:41:0x005f, B:42:0x0068, B:46:0x0074, B:47:0x007c, B:51:0x0087, B:52:0x008d, B:56:0x0098, B:58:0x009e, B:60:0x00a5, B:61:0x00aa, B:63:0x00ab, B:64:0x00b0, B:71:0x00b1, B:72:0x00b8, B:73:0x00b9, B:75:0x0142, B:76:0x0147, B:78:0x0148, B:79:0x014f), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(ByteBuffer byteBuffer, com.vk.movika.sdk.base.data.converter.c cVar) throws bJ {
        Exception exc;
        tly0 tly0Var;
        nly0 nly0Var = (nly0) this.b;
        nly0Var.getClass();
        for (ByteBuffer byteBuffer2 = byteBuffer; byteBuffer2.remaining() > 0; byteBuffer2 = byteBuffer2.slice()) {
            try {
            } catch (aP e) {
                e = e;
                exc = e;
                if (byteBuffer2.position() == 0) {
                    byteBuffer2.remaining();
                }
                if (!nly0Var.h.apply(byteBuffer2, exc).booleanValue()) {
                    if (exc instanceof aP) {
                        exc.getMessage();
                    } else {
                        exc.toString();
                    }
                }
                if (byteBuffer2.position() == 0) {
                }
            } catch (one.video.calls.sdk_private.bt e2) {
                e = e2;
                exc = e;
                if (byteBuffer2.position() == 0) {
                }
                if (!nly0Var.h.apply(byteBuffer2, exc).booleanValue()) {
                }
                if (byteBuffer2.position() == 0) {
                }
            } catch (one.video.calls.sdk_private.bz unused) {
                return;
            }
            if (byteBuffer2.remaining() < 2) {
                throw new one.video.calls.sdk_private.bz("packet too short to be valid QUIC packet");
            }
            byte b = byteBuffer2.get();
            if ((b & 64) != 64) {
                throw new one.video.calls.sdk_private.bz();
            }
            if ((b & 128) != 128) {
                kgy0 kgy0Var = nly0Var.b.a;
                xly0 xly0Var = new xly0();
                xly0Var.a = kgy0Var;
                tly0Var = xly0Var;
            } else {
                if (byteBuffer2.remaining() + 1 < 7) {
                    throw new one.video.calls.sdk_private.bz("packet too short to be valid QUIC long header packet");
                }
                int i = (b & 48) >> 4;
                int i2 = byteBuffer2.getInt();
                kgy0 kgy0Var2 = new kgy0(i2);
                kgy0 kgy0Var3 = nly0Var.b.a;
                if (i2 == 0) {
                    tly0Var = new amy0(kgy0Var3);
                } else if (kgy0Var2.b()) {
                    if (i == 1) {
                        cly0 cly0Var = new cly0(kgy0Var2);
                        cly0Var.h = null;
                        tly0Var = cly0Var;
                    }
                    if (kgy0Var2.b()) {
                        if (i == 0) {
                            uly0 uly0Var = new uly0();
                            uly0Var.a = kgy0Var3;
                            tly0Var = uly0Var;
                        }
                        if (kgy0Var2.b()) {
                            if (i == 3) {
                                tly0Var = new aly0(kgy0Var3);
                            }
                            if (!kgy0Var2.b()) {
                                if (i != 1) {
                                    throw new RuntimeException();
                                }
                                if (nly0Var.f != bI.a) {
                                }
                            } else {
                                if (i != 2) {
                                    throw new RuntimeException();
                                }
                                if (nly0Var.f != bI.a) {
                                    throw new one.video.calls.sdk_private.bz();
                                }
                                tly0Var = new hmy0(kgy0Var2);
                            }
                        }
                    }
                }
            }
            tly0 tly0Var2 = tly0Var;
            if (tly0Var2.n() != null) {
                tly0Var2.h(byteBuffer2, nly0Var.a(tly0Var2), tly0Var2.o() != null ? nly0Var.g[tly0Var2.o().ordinal()] : 0L, nly0Var.e, nly0Var.c);
            } else {
                tly0Var2.h(byteBuffer2, null, 0L, nly0Var.e, 0);
            }
            if (tly0Var2.p() != null && tly0Var2.p().longValue() > nly0Var.g[tly0Var2.o().ordinal()]) {
                nly0Var.g[tly0Var2.o().ordinal()] = tly0Var2.p().longValue();
            }
            byteBuffer2.position();
            byteBuffer2.remaining();
            nly0Var.d.a(tly0Var2, new com.vk.movika.sdk.base.data.converter.c(cVar, byteBuffer2.hasRemaining()));
            if (byteBuffer2.position() == 0) {
                return;
            }
        }
    }

    @Override // xsna.e1y0
    public void j() {
        com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.b;
        int i = ify.a;
        if (ify.e(ify.c)) {
            aVar.h(MsgSendHidePopupsReason.OTHER);
        } else {
            aVar.H();
        }
    }

    public void k() {
        dw20 dw20Var = ((jid) this.b).a;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    @Override // xsna.xs1
    public int t() {
        return ((xs1) this.b).t();
    }

    @Override // xsna.xs1
    public Set v(float f) {
        return ((xs1) this.b).v(f);
    }

    @Override // xsna.xs1
    public boolean x(ArrayList arrayList) {
        return ((xs1) this.b).x(arrayList);
    }

    @Override // xsna.ttz0
    public void zza(Bitmap bitmap) {
        if (bitmap != null) {
            ExpandedControllerActivity expandedControllerActivity = (ExpandedControllerActivity) this.b;
            TextView textView = expandedControllerActivity.I;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = expandedControllerActivity.H;
            if (imageView != null) {
                imageView.setVisibility(0);
                expandedControllerActivity.H.setImageBitmap(bitmap);
            }
        }
    }

    public rhh0(int i) {
        switch (i) {
            case 12:
                this.b = new bpn0(new mg(25));
                break;
            default:
                this.b = new g5i0();
                break;
        }
    }
}
