package xsna;

import android.content.Context;
import androidx.media3.datasource.a;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.models.offline.VideoScreenMode;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import one.video.exo.offline.DownloadInfo;

/* compiled from: VideoOfflineManager.kt */
/* loaded from: classes.dex */
public interface ezs0 extends bzs0 {
    default io.reactivex.rxjava3.core.q<List<czs0>> B() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    default boolean E() {
        return false;
    }

    default boolean G() {
        return false;
    }

    default boolean c(String str) {
        return false;
    }

    default mm80 f() {
        return null;
    }

    default io.reactivex.rxjava3.core.x<List<czs0>> h() {
        return io.reactivex.rxjava3.core.x.k(EmptyList.b);
    }

    boolean isEnabled();

    default boolean j() {
        return false;
    }

    default boolean k(VideoFile videoFile) {
        return c(videoFile.r1());
    }

    default boolean p() {
        return false;
    }

    default long q() {
        return 0L;
    }

    default boolean r() {
        return false;
    }

    default DownloadInfo s(String str) {
        return null;
    }

    default Map<String, DownloadInfo> u() {
        return jgp.b;
    }

    default String v(String str) {
        return "";
    }

    default DownloadInfo x(VideoFile videoFile) {
        return s(videoFile.r1());
    }

    default boolean y() {
        return false;
    }

    default void H() {
    }

    default void a() {
    }

    default void e() {
    }

    default void init() {
    }

    default void l() {
    }

    default a.InterfaceC0045a C(a.InterfaceC0045a interfaceC0045a) {
        return interfaceC0045a;
    }

    default void D(VideoFileOld videoFileOld) {
    }

    default void b(boolean z) {
    }

    default void g(boolean z) {
    }

    default void t(hu70 hu70Var) {
    }

    default void z(hu70 hu70Var) {
    }

    default void F(VideoFile videoFile, VideoScreenMode videoScreenMode) {
    }

    default void d(VideoFile videoFile, VideoScreenMode videoScreenMode) {
    }

    default void n(VideoFile videoFile, VideoScreenMode videoScreenMode) {
    }

    default void w(ths0 ths0Var, Context context, boolean z, gzs gzsVar, z2d0 z2d0Var) {
    }
}
