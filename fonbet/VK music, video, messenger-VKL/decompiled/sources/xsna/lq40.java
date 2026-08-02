package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.offline.api.exception.OfflinePlaylistNotFoundException;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: MusicOfflineManager.kt */
/* loaded from: classes.dex */
public interface lq40 extends li40, pq40, vd50, g9o, ri40, jco {

    /* compiled from: MusicOfflineManager.kt */
    /* loaded from: classes3.dex */
    public static final class a implements lq40 {
        public static final /* synthetic */ a a = new a();

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<MusicTrack>> A() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.a B() {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }

        @Override // xsna.g9o
        public final io.reactivex.rxjava3.core.a D(int i, String str) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }

        @Override // xsna.li40
        public final boolean I() {
            return false;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.k<Playlist> K(int i, UserId userId) {
            return new io.reactivex.rxjava3.internal.operators.maybe.j(new OfflinePlaylistNotFoundException(i, userId));
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.q<List<MusicTrack>> M(UserId userId, OfflineEntitySortType offlineEntitySortType) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }

        @Override // xsna.g9o
        public final io.reactivex.rxjava3.core.a N(UserId userId) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }

        @Override // xsna.li40
        public final boolean P() {
            return false;
        }

        @Override // xsna.jco
        public final boolean Z() {
            return false;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<Playlist>> b() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.g9o
        public final boolean d(String str) {
            return false;
        }

        @Override // xsna.pq40
        public final long f(kz0 kz0Var) {
            return 0L;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<OfflinePodcast>> h() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<AudioBook>> i() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.pq40
        public final List<Playlist> j() {
            return EmptyList.b;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<Playlist>> k() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.x<List<Playlist>> l() {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }

        @Override // xsna.pq40
        public final long m(dam damVar) {
            return 0L;
        }

        @Override // xsna.pq40
        public final long n(vd1 vd1Var) {
            return 0L;
        }

        @Override // xsna.g9o
        public final boolean o() {
            return false;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.q<Result<AudioBook>> r(int i) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }

        @Override // xsna.g9o
        public final io.reactivex.rxjava3.core.a s(int i) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }

        @Override // xsna.pq40
        public final io.reactivex.rxjava3.core.a t() {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }

        @Override // xsna.ri40
        public final io.reactivex.rxjava3.core.q<List<Playlist>> w() {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }

        @Override // xsna.ri40
        public final List<Playlist> z() {
            return EmptyList.b;
        }

        @Override // xsna.jco
        public final void H() {
        }

        @Override // xsna.g9o
        public final void b0() {
        }

        @Override // xsna.g9o
        public final void c() {
        }

        @Override // xsna.g9o
        public final void g() {
        }

        @Override // xsna.g9o
        public final void p() {
        }

        @Override // xsna.g9o
        public final void u() {
        }

        @Override // xsna.g9o
        public final void x() {
        }

        @Override // xsna.g9o
        public final void F(List<MusicTrack> list) {
        }

        @Override // xsna.g9o
        public final void J(List<String> list) {
        }

        @Override // xsna.g9o
        public final void L(MusicTrack musicTrack) {
        }

        @Override // xsna.g9o
        public final void Q(MusicTrack musicTrack) {
        }

        @Override // xsna.li40
        public final void S(boolean z) {
        }

        @Override // xsna.g9o
        public final void V(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void Y(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void a(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void a0(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void e(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void v(Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void E(Context context, Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void G(Playlist playlist, boolean z) {
        }

        @Override // xsna.g9o
        public final void R(Context context, MusicTrack musicTrack) {
        }

        @Override // xsna.g9o
        public final void T(Context context, Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void W(Playlist playlist, icz iczVar) {
        }

        @Override // xsna.g9o
        public final void X(Context context, Playlist playlist) {
        }

        @Override // xsna.g9o
        public final void q(MusicTrack musicTrack, Playlist playlist) {
        }

        @Override // xsna.vd50
        public final void y(String str, boolean z) {
        }

        @Override // xsna.g9o
        public final void C(Context context, AudioBook audioBook, AudioBookChapter audioBookChapter) {
        }

        @Override // xsna.g9o
        public final void U(Activity activity, PodcastInfo podcastInfo, MusicTrack musicTrack) {
        }

        @Override // xsna.vd50
        public final void O(boolean z, UserId userId, MusicTrack musicTrack, oya0 oya0Var) {
        }
    }
}
