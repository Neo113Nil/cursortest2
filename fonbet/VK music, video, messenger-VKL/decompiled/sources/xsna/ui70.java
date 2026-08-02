package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.PushOpenActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: NotificationsBridge.kt */
/* loaded from: classes.dex */
public interface ui70 {
    static /* synthetic */ void L(ui70 ui70Var, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        ui70Var.f(str, str2, str3, str4, 0, str5, (i & 32) != 0 ? null : str6);
    }

    Bitmap B(long j, long j2);

    default boolean E(Context context, UserId userId, VoipCallSource voipCallSource, com.vk.pushes.receivers.b bVar) {
        return false;
    }

    default boolean F(long j) {
        return false;
    }

    default File H(long j, String str) {
        return null;
    }

    Map<Long, Bitmap> I(Collection<Long> collection);

    default Intent K(Context context, long j, String str) {
        return new Intent();
    }

    default oz50 M() {
        return null;
    }

    default Bitmap N(Context context, int i, ArrayList arrayList, float f) {
        return null;
    }

    int S();

    Long a();

    void b();

    Pair<String, Long> c();

    String d();

    default boolean e() {
        return false;
    }

    default oz50 h(long j, String str) {
        return null;
    }

    default boolean i(Context context, Long l, long j, boolean z) {
        return false;
    }

    boolean m(int i, long j, long j2);

    default Intent p(Context context, int i, String str) {
        return new Intent();
    }

    default Intent r(Context context, String str) {
        return new Intent();
    }

    Class<? extends Activity> s();

    default boolean w(UserId userId, String str) {
        return false;
    }

    default boolean z() {
        return false;
    }

    default void C() {
    }

    default void P() {
    }

    default void Q() {
    }

    default void l() {
    }

    default void q() {
    }

    default void A(JSONObject jSONObject) {
    }

    default void k(String str) {
    }

    default void n(boolean z) {
    }

    default void t(Long l) {
    }

    default void u(JSONObject jSONObject) {
    }

    default void v(Context context) {
    }

    default void G(PushOpenActivity pushOpenActivity, int i) {
    }

    default void J(Context context, Intent intent) {
    }

    default void g(Context context, Handler handler) {
    }

    default void j(int i, Context context) {
    }

    default void o(AppCompatActivity appCompatActivity, String str) {
    }

    default void y(long j, Context context) {
    }

    default void R(PushOpenActivity pushOpenActivity, String str, String str2) {
    }

    default void x(PushOpenActivity pushOpenActivity, String str, String str2) {
    }

    default void O(PushOpenActivity pushOpenActivity, String str, String str2, String str3, String str4) {
    }

    default void f(String str, String str2, String str3, String str4, int i, String str5, String str6) {
    }
}
